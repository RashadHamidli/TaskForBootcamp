package com.company.controllers;

import com.company.dto.request.LoginRequest;
import com.company.dto.responce.LoginResponse;
import com.company.dto.request.UserRequest;
import com.company.services.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/auth")
public class AuthenticationController {
    private final AuthenticationService authenticationService;

    @PostMapping("/signup")
    public ResponseEntity<LoginResponse> signUp(@RequestBody UserRequest userRequest) {
        return ResponseEntity.ok(authenticationService.registerUser(userRequest));
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest loginRequest) {
        return ResponseEntity.ok(authenticationService.login(loginRequest));
    }

}
