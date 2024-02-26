package com.company;

import com.company.controller.UserController;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication()
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

    }
}
