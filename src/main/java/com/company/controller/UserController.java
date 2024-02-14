package com.company.controller;

import com.company.entity.User;
import com.company.services.UserService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<User> createUser(@Valid @RequestBody User user) {
        userService.createUser(user);
        return ResponseEntity.ok(user);
    }

    @DeleteMapping("/{id}")
    private void deleteUser(@PathVariable long id) {
        userService.deleteUser(id);
    }
}
