package com.company;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Launcher {
    public static void main(String[] args) {
        System.setProperty("server.port", "8081");
        SpringApplication.run(Launcher.class, args);
    }
}
