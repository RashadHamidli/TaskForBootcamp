package com.company;

import com.company.controller.UserController;
import com.company.entity.User;
import com.company.services.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.http.ResponseEntity;

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
//        User user=new User();
//        user.setAge(25);
//        user.setName("John");
//        user.setSurname("Brown");
//        ResponseEntity<User> userPrint = userController.createUser(user);
//        System.out.println(userPrint);
    }
}
