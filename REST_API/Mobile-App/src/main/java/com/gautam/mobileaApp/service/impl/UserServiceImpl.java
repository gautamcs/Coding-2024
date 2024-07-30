package com.gautam.mobileaApp.service.impl;

import com.gautam.mobileaApp.model.UserDetailRequestModel;
import com.gautam.mobileaApp.model.UserDetails;
import com.gautam.mobileaApp.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public UserDetails addUser(UserDetailRequestModel userDetailRequestModel) {
        UserDetails userDetails = new UserDetails();
        int id = new Random().nextInt(120);
        userDetails.setUserId(id);
        userDetails.setUserName(userDetailRequestModel.getFirstName().concat(" ").concat(userDetailRequestModel.getLastName()));
        userDetails.setUserAddress(userDetailRequestModel.getAddress());
        userDetails.setEmailId(userDetailRequestModel.getEmail());
        userDetails.setMobile(userDetailRequestModel.getMobile());

        return userDetails;
    }
}
