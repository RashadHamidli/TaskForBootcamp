package com.company.dto.request;

import com.company.entities.User;
import jakarta.transaction.Transactional;
import lombok.Data;

import java.time.LocalDate;
import java.util.Optional;

@Data
public class UserRequest {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private LocalDate birthdate;

    public static User updateUser(User user, User foundUser) {
        Optional.ofNullable(user.getFirstName()).ifPresent(foundUser::setFirstName);
        Optional.ofNullable(user.getLastName()).ifPresent(foundUser::setLastName);
        Optional.ofNullable(user.getEmail()).ifPresent(foundUser::setEmail);
        Optional.ofNullable(user.getPassword()).ifPresent(foundUser::setPassword);
        Optional.ofNullable(user.getBirthDate()).ifPresent(foundUser::setBirthDate);
        return foundUser;
    }

    public static User converteUser(UserRequest userRequest) {
        User user = new User();
        user.setFirstName(userRequest.firstName);
        user.setLastName(userRequest.lastName);
        user.setEmail(userRequest.email);
        user.setPassword(userRequest.password);
        user.setBirthDate(userRequest.birthdate);
        return user;
    }
}
