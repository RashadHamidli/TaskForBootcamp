package com.company.controllers;


import com.company.dto.LoginRequest;
import com.company.entities.User;
import com.company.services.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/login")
public class LoginController {

    private final AuthenticationService authenticationService;

    @GetMapping()
    public String login() {
        return "login";
    }

    @PostMapping("/post")
    public String loginPost(@RequestBody LoginRequest loginRequest) {
        User user = authenticationService.loginMvc(loginRequest);
        return "user";
    }
}




