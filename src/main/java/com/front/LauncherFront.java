package com.front;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class LauncherFront {
    public static void main(String[] args) {
        System.setProperty("server.port", "8082");
        System.setProperty("server.servlet.context-path","/api");
        SpringApplication.run(LauncherFront.class);
    }
}
