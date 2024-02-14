package com.example;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Import;

@Import(DevelopmentService.class)
public class ProductionService implements MyService{
    @Value("${spring.app.value.name:dev}")
    private String name;

    @Override
    public String getInfo() {
        return "this run service is \"Production Service\"";
    }
}
