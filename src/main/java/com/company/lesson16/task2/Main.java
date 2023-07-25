package com.company.lesson16.task2;

public class Main {
    public static void main(String[] args) {
        EmployeeManager e = new EmployeeManager();
        e.name="Rashad";
        e.surname="Ham";
        e.salary=2500;
        String registerNumber = e.getRegisterNumber();
        System.out.println(registerNumber);



    }
}
