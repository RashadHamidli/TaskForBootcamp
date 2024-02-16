package com.front;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LauncherFront {
    public static void main(String[] args) {
        System.setProperty("server.port", "8082");
        System.setProperty("server.servlet.context-path","/api");
        SpringApplication.run(LauncherFront.class);
    }
}