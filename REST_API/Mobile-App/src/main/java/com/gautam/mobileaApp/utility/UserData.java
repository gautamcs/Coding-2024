package com.gautam.mobileaApp.utility;

import com.gautam.mobileaApp.model.UserDetails;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserData {

    @Bean
    public List<UserDetails> getUserData() {
        Map<Integer, UserDetails> map = new HashMap<>();
        map.put(101, new UserDetails(101, "Gautam", "Hyderabad", "gtm@abc.com", "9931796994"));
        map.put(105, new UserDetails(105, "Sonam", "Hyderabad", "sonam@yahoo.com", "9567542123"));
        map.put(121, new UserDetails(121, "Bantu", "Hyderabad", "bantu@gmail.com", "87895642"));
        map.put(95, new UserDetails(95, "Chandan", "Patna", "chandan@gmail.com", "9984543234"));
        map.put(11, new UserDetails(11, "Piyush", "Matia", "piyush@rediff.com", "9985667653"));
        map.put(21, new UserDetails(21, "Anna", "Delhi", "anna@yahoo.com", "9867453243"));

        Collection<UserDetails> userDetails = map.values();
        List<UserDetails> list = new ArrayList<>(userDetails);
        return list;
    }
}
