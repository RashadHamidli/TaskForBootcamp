package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean("dev1")
    public MyService devService1() {
        return new DevelopmentService();
    }

    @Bean("dev2")
    public MyService devService2() {
        return new DevelopmentService();
    }

    @Bean("prod1")
    public MyService prodService1() {
        return new ProductionService();
    }

    @Bean("prod2")
    public MyService prodService2() {
        return new ProductionService();
    }

    //    @Profile("test")
    @Bean("test")
    public MyService testService() {
        return new MyService() {
            @Override
            public String getInfo() {
                return "this service is \"Test Service\"";
            }
        };
    }


}
