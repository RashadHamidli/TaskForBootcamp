package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class Config {
    @Bean
    @Profile("dev")
    public MyService devService() {
        return new DevelopmentService();
    }

    @Bean
    @Profile("prod")
    public MyService prodService() {
        return new ProductionService();
    }
}
