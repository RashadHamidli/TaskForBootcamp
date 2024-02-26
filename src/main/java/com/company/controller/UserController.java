package com.company.controller;

import com.company.entity.User;
import com.company.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    private List<User> getAllUser() {
        return userService.getAllUser();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    private User getUserById(@PathVariable long id) {
        return userService.getUserById(id);
    }

    @GetMapping("/{email}")
    @ResponseStatus(HttpStatus.OK)
    private User getUserByEmail(@PathVariable String email) {
        return userService.getUserByEmail(email);
    }

}
