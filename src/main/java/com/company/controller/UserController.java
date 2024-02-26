package com.company.controller;

import com.company.dto.UserDTO;
import com.company.entity.User;
import com.company.services.UserService;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAllUser() {
        return userService.getAll();
    }

    @GetMapping("/{age}")
    public List<User> findTop5ByAge(@PathVariable Integer age) {
        return userService.findTop5ByAge(age);
    }
    @GetMapping("/{agef}")
    public List<User> findFirst5ByAge(@PathVariable(name = "agef") Integer age){
        return userService.findFirst5ByAge(age);
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

    public User getUser(User user){
        UserDTO u = userService.getUser(user);
        return userService.getUserDTO(u);
    }
}
