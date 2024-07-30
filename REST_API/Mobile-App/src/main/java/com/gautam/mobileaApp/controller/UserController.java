package com.gautam.mobileaApp.controller;

import com.gautam.mobileaApp.model.UserDetailRequestModel;
import com.gautam.mobileaApp.model.UserDetails;
import com.gautam.mobileaApp.service.UserService;
import com.gautam.mobileaApp.utility.UserData;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private  UserData userData = new UserData();
    List<UserDetails> userList = userData.getUserData();

    //http://localhost:8080/users?page=1&limit=4
    @GetMapping
    public String getUser(@RequestParam(value = "page") String page,
                          @RequestParam(value = "limit", defaultValue = "5") int limit) {
        return "Page: " + page + " With Limit: " + limit;
    }

    @GetMapping("/{userId}")
    public ResponseEntity<List<UserDetails>> getUseById(@PathVariable int userId) {
        List<UserDetails> userDetailList = userList.stream().filter(l -> l.getUserId() == userId).collect(Collectors.toList());//.get(0);
        if (null != userDetailList) {
            return new ResponseEntity<>(userDetailList, HttpStatus.OK);
        }
        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }

    @GetMapping(value = "/allUser", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<UserDetails>> getUseDetails() {
        // Comment part of code is for Understanding how to handle the exception
//        String str = "";
//        if(str.length() < 2) {
//            throw new UserServiceException("String length doesn't match !");
//        }
//        str.charAt(6);
        return new ResponseEntity<>(userList, HttpStatus.OK);
    }

    // http://localhost:8080/users/byUserId/11
    @GetMapping(path = "/byUserId/{userId}", produces = {MediaType.APPLICATION_JSON_VALUE,
            MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<UserDetails> getUserDetailsByUserId(@PathVariable int userId) {
//        UserDetails userDetails = new UserDetails();
//        userDetails.setUserId(userId);
//        userDetails.setUserName("Jaku");
//        userDetails.setUserAddress("Hyderabad");
        if (userList.get(userId) != null) {
            return new ResponseEntity<>(userList.get(userId), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

    // http://localhost:8080/users/11
    @GetMapping(path = "/{userId}", produces = {MediaType.APPLICATION_JSON_VALUE,
            MediaType.APPLICATION_XML_VALUE})
    public UserDetails getUserDetails(@PathVariable int userId) {
        UserDetails userDetails = new UserDetails();
        userDetails.setUserId(userId);
        userDetails.setUserName("Jaku");
        userDetails.setUserAddress("Hyderabad");

        return userDetails;
    }

    @PostMapping(value = "/addUser", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserDetails> addUser(@Valid @RequestBody UserDetailRequestModel userDetailRequestModel) {
//        UserDetails userDetails = new UserDetails();
//        int id = new Random().nextInt(120);
//        userDetails.setUserId(id);
//        userDetails.setUserName(userDetailRequestModel.getFirstName().concat(" ").concat(userDetailRequestModel.getLastName()));
//        userDetails.setUserAddress(userDetailRequestModel.getAddress());
//        userDetails.setEmailId(userDetailRequestModel.getEmail());
//        userDetails.setMobile(userDetailRequestModel.getMobile());
//
//        if(userList == null) {
//           // users = new HashMap<>();
//            //users.put(id, userDetails);
//            userList.add(userDetails);
//        }
        //UserDetails userDetails = new UserServiceImpl().addUser(userDetailRequestModel);
        UserDetails userDetails = userService.addUser(userDetailRequestModel);
        return new ResponseEntity<>(userDetails, HttpStatusCode.valueOf(201));
    }

    // http://localhost:8080/users
    @PutMapping()
    public String updateUser() {
        return "Update Method !";
    } // This will work without any request body

    @PutMapping("/updateUser")
    public ResponseEntity<UserDetails> updateUserDetailsById(@RequestBody UserDetailRequestModel userDetailRequestModel) {
        if (userDetailRequestModel == null) {
            return new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUserById(@PathVariable int id) {
        if (null != userList) {
            for (UserDetails user : userList) {
                if (user.getUserId() == id) {
                    userList.remove(user);
                }
            }
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

}
