package com.company.lesson16.task2;

public class Main {
    public static void main(String[] args) {
        EmployeeManager<Integer> e = new EmployeeManager<>();
        e.name = "Rashad";
        e.surname = "Hamidli";
        e.salary = 2500;
        EmployeeManager<Double> ed = new EmployeeManager<>();
        ed.name="Ahmad";
        ed.surname="Mammdov";
        ed.salary=2200.50;
        System.out.println(e);
        System.out.println(ed);



    }
}
