package com.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class MyCommandLineRunner implements CommandLineRunner {

    private final MyService myService;


    public MyCommandLineRunner(@Qualifier("prod1") MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(myService.getInfo());

    }

}
