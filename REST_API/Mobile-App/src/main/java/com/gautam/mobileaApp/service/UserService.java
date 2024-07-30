package com.gautam.mobileaApp.service;

import com.gautam.mobileaApp.model.UserDetailRequestModel;
import com.gautam.mobileaApp.model.UserDetails;
import org.springframework.stereotype.Service;

public interface UserService {
    UserDetails addUser(UserDetailRequestModel userDetailRequestModel);

}
