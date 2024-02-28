package com.company.dto;

import com.company.entities.User;

import java.util.Optional;

public class UserRequest {

    public static User updateUser(User user, User foundUser) {
        Optional.ofNullable(user.getFirstName()).ifPresent(foundUser::setFirstName);
        Optional.ofNullable(user.getLastName()).ifPresent(foundUser::setLastName);
        Optional.ofNullable(user.getEmail()).ifPresent(foundUser::setEmail);
        Optional.ofNullable(user.getPassword()).ifPresent(foundUser::setPassword);
        Optional.ofNullable(user.getAge()).ifPresent(foundUser::setAge);
        Optional.ofNullable(user.getBirthDate()).ifPresent(foundUser::setBirthDate);
        System.out.println(foundUser);
        return foundUser;
    }
}
