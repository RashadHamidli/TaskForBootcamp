package com.example;

public class DevelopmentService implements MyService {

    @Override
    public String getInfo() {
        return "this run service is \"Development Service\" " + getClass().getSimpleName();
    }
    public void foo1(){
        System.out.println("foo1");
    }
    private void foo2(){
        System.out.println("foo2");
    }
}
