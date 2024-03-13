//package com.company.services;
//
//import com.company.entities.User;
//import com.company.repository.UserRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//@Service
//@RequiredArgsConstructor
//public class LoginService {
//    private final UserRepository userRepository;
//
//    public boolean loginControl(String email, String password) {
//        User foundUser = userRepository.findByEmail(email);
//        if (password.equals(foundUser.getPassword())) {
//            return true;
//        }
//        return false;
//    }
//}
