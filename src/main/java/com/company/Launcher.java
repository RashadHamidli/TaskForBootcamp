package com.company;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class Launcher {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Launcher.class, args);
        Arrays.stream(run.getBeanDefinitionNames()).forEach(System.out::println);
        int count = run.getBeanDefinitionCount();
        System.out.println(count);
    }

}
