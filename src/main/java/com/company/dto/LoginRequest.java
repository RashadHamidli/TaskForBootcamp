package com.company.dto;

import com.company.entities.User;

public record LoginRequest(String email, String password) {
    public User userConvert() {
        User user = new User();
        user.setEmail(email);
        user.setPassword(password);
        return user;
    }

}
