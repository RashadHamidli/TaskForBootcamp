package com.company.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/user")
    public String getUser(){
        return "Hello User";
    }
    @GetMapping("/user1")
    public String getUser1(){
        return "Hello User one";
    }
}
