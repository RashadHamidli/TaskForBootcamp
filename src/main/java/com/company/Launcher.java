package com.company;

import com.company.controllers.BookRestController;
import com.company.entities.Book;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class Launcher {


    public static void main(String[] args) {
        SpringApplication.run(Launcher.class, args);
    }

    @Bean
    public CommandLineRunner runner(BookRestController bookRestController) {
        return args -> {

        };
    }

}
