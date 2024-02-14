package com.company.controller;

import com.company.entity.User;
import com.company.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAllUser() {
        return userService.getAll();
    }

    @GetMapping("/{id}")
    public User getOneUser(@PathVariable long id) {
        return userService.findById(id);
    }

    @PostMapping("/create")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @DeleteMapping("/{id}")
    private void deleteUser(@PathVariable long id) {
        userService.deleteUser(id);
    }
}
