package com.company.controllers;


import com.company.dto.LoginRequest;
import com.company.entities.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/login")
public class LoginRestController {

    private final AuthenticationManager authenticationManager;

    @GetMapping
    public String login() {
        return "login";
    }

    @PostMapping
    public String loginPost(@RequestBody LoginRequest loginRequest) {
        return "user";
    }
}




