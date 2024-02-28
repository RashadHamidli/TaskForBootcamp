package com.company.controllers;

import com.company.entities.User;
import com.company.services.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user")
public class UserRestController {
    private final UserService userService;

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    private List<User> getAllUser() {
        return userService.getAllUser();
    }
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    private User getUserById(@PathVariable Long id){
        return userService.getUserById(id);
    }
    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    private User createUser(@Valid @RequestBody User user){
        return userService.createUser(user);
    }
    @PutMapping("/{id}")
    private User updateUser(@PathVariable Long id, @RequestBody User user){
        return userService.updateUser(id,user);
    }

}
