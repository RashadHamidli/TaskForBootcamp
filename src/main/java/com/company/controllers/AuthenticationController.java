package com.company.controllers;

import com.company.dto.LoginRequest;
import com.company.dto.LoginResponse;
import com.company.dto.UserRequest;
import com.company.security.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AuthenticationController {
    private final AuthenticationService authenticationService;

    @PostMapping("/create")
    public ResponseEntity<LoginResponse> createUser(@RequestBody UserRequest userRequest){
        return ResponseEntity.ok(authenticationService.save(userRequest));
    }
    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest loginRequest){
        return ResponseEntity.ok(authenticationService.login(loginRequest));
    }
}
