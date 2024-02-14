package com.front.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping("/api")
public class UserController {

    @GetMapping("/user")
    public ResponseEntity<String> getFront() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:8081/api/user", String.class);
        return new ResponseEntity<>(response.getBody(), HttpStatus.OK);
    }
}
