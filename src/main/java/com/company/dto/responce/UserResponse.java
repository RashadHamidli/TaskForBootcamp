package com.company.dto.responce;

import com.company.entities.User;
import lombok.Data;

import java.time.LocalDate;

@Data
public class UserResponse {
    private Long id;
    private String firstname, lastname, email;
    private Integer age;
    private LocalDate birthdate;


    public static UserResponse convertUserToUserResponse(User user) {
        UserResponse userResponse = new UserResponse();
        userResponse.setId(user.getId());
        userResponse.setFirstname(user.getFirstName());
        userResponse.setLastname(user.getLastName());
        userResponse.setEmail(user.getEmail());
        userResponse.setAge(user.getAge());
        userResponse.setBirthdate(user.getBirthDate());
        return userResponse;
    }
}
