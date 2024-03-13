package com.company.dto;

import com.company.entities.User;

import java.time.LocalDate;
import java.util.Optional;

public class UserRequest {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private int age;
    private LocalDate birthdate;


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

    public static User converteUser(UserRequest userRequest) {
        User user = new User();
        user.setFirstName(userRequest.firstName);
        user.setLastName(userRequest.lastName);
        user.setEmail(userRequest.email);
        user.setPassword(userRequest.password);
        user.setAge(userRequest.age);
        user.setBirthDate(userRequest.birthdate);
        return user;
    }
}
