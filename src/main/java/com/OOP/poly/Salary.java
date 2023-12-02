package com.OOP.poly;


import java.io.IOException;

public class Salary extends Employee {
    @Override
    public void foo() {
        super.foo();
        System.out.println("foo in Salary");
    }
}
