package com.company.dto;

import com.company.entities.User;

public class UserRequest {

    public static User updateUser(User user, User foundUser) {
        foundUser.setFirstName(user.getFirstName());
        foundUser.setLastName(user.getLastName());
        foundUser.setEmail(user.getEmail());
        foundUser.setPassword(user.getPassword());
        foundUser.setAge(user.getAge());
        foundUser.setBirthDate(user.getBirthDate());
        return foundUser;
    }
}
