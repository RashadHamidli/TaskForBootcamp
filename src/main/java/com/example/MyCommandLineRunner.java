package com.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class MyCommandLineRunner implements CommandLineRunner {
    private final MyService myService;
    private final Environment environment;

    public MyCommandLineRunner(MyService myService, Environment environment) {
        this.myService = myService;
        this.environment = environment;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(myService.getInfo());
        List<String> list = Arrays.stream(environment.getActiveProfiles()).toList();
        System.out.println(list);
    }

}
