package com.example;

public class DevelopmentService implements MyService{

    @Override
    public String getInfo() {
        return "this run service is \"Development Service\"";
    }
}
