package com.example;

import org.springframework.context.annotation.Import;

@Import(DevelopmentService.class)
public class ProductionService implements MyService{
    @Override
    public String getInfo() {
        return "this run service is \"Production Service\"";
    }
}
