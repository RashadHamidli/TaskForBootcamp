package com.company.controller;

import com.company.entity.User;
import com.company.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
@Api(tags = "User API")
public class UserController {
    private final UserService userService;

    @GetMapping("/all")
    @ApiOperation("Get all users")
    private List<User> getAllUser() {
        return userService.getAllUser();
    }

    @GetMapping("/{id}")
    @ApiOperation("Get user by ID")
    private User getUserById(@PathVariable long id) {
        return userService.getUserById(id);
    }

    @GetMapping("/{email}")
    @ApiOperation("Get user by email")
    private User getUserByEmail(@PathVariable String email) {
        return userService.getUserByEmail(email);
    }

}
