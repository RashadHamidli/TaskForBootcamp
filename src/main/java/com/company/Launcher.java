package com.company;

import com.company.controllers.UserRestController;
import com.company.dto.request.UserRequest;
import com.company.dto.responce.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@RequiredArgsConstructor
public class Launcher {
    private final UserRestController userRestController;


    public static void main(String[] args) {
        SpringApplication.run(Launcher.class, args);
    }

    @Bean
    public CommandLineRunner runner(UserRestController userRestController) {
        return args -> {
            UserRequest userRequest = new UserRequest();
            userRequest.setEmail("john_b@gmail.com");
            UserResponse userResponse = userRestController.updateUser(3L, userRequest);
            System.out.println(userResponse);
            UserResponse userById = userRestController.getUserById(3L);
            System.out.println(userById);
        };
    }

}
