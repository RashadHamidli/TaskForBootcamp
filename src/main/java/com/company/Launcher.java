package com.company;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Launcher {


    public static void main(String[] args) {
        SpringApplication.run(Launcher.class, args);
    }

//    @Bean
//    public CommandLineRunner runner( ) {
//        return args -> {
//
//        };
//    }

}
