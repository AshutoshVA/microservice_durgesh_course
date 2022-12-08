package com.user.userservice.services;

import com.user.userservice.entities.User;

import java.util.List;

public interface UserService {

    // User operations

    //create
    User saveUser(User user);

    //get all user
    List<User> getAllUser();

    //get single user of given userId
    User getUser(String userId);
}
