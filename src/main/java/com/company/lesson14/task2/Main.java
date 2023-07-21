package com.company.lesson14.task2;

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setId(1);
        e.setName("Rashad");
        e.setSalary(500);
        System.out.println(e.toString()+"\nnet salary: " + e.netSalary(e.getSalary()));
    }
}
