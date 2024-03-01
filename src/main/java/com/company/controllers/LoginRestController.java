package com.company.controllers;


import com.company.dto.LoginFormRequest;
import com.company.services.LoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/login")
public class LoginRestController {

    private final LoginService loginService;

    @PostMapping
    public ResponseEntity<String> login(@RequestBody LoginFormRequest form) {
        String email = form.getEmail();
        String password = form.getPassword();
        loginService.loginControl(email, password);
        return ResponseEntity.ok("Login successful");
    }
}




