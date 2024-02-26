package com.company.controller;

import com.company.dto.UserDTO;
import com.company.entity.User;
import com.company.services.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
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

    public User getUser(User user) {
        UserDTO u = userService.getUser(user);
        return userService.getUserDTO(u);
    }
}
