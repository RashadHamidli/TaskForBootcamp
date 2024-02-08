package com.example;

public class ProductionService implements MyService{
    @Override
    public String getInfo() {
        return "this run service is \"Production Service\"";
    }
}
