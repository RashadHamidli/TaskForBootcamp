package com.company.controllers;


import com.company.dto.LoginRequest;
import com.company.dto.LoginResponse;
import com.company.services.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/login")
public class LoginController {

    private final AuthenticationService authenticationService;

    @GetMapping
    public String login() {
        return "login";
    }

    @PostMapping()
    @ResponseBody
    public String loginPost(@RequestBody LoginRequest loginRequest) {
        LoginResponse login = authenticationService.login(loginRequest);
        return "user";
    }
}




