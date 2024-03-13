package com.company.controllers;

import com.company.dto.LoginResponse;
import com.company.dto.UserRequest;
import com.company.entities.User;
import com.company.security.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@@RequiredArgsConstructor
public class AuthenticationController {
    private final AuthenticationService authenticationService;

    @PostMapping
    public ResponseEntity<LoginResponse> createUser(@RequestBody UserRequest userRequest){
        return ResponseEntity.ok(authenticationService.save(userRequest));
    }
}
