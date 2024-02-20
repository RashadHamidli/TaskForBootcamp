package com.company;

import com.company.controller.UserController;
import com.company.entity.User;
import com.company.services.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.http.ResponseEntity;

import java.util.List;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class Launcher implements CommandLineRunner {

    private final UserController userController;

    public Launcher(UserController userController) {
        this.userController = userController;
    }

    public static void main(String[] args) {
        System.setProperty("server.port", "8080");
        SpringApplication.run(Launcher.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        List<User> first5ByAge = userController.findFirst5ByAge(25);
        first5ByAge.stream().forEach(System.out::println);

        List<User> top5ByAge = userController.findFirst5ByAge(25);
        top5ByAge.stream().forEach(System.out::println);
    }
}
