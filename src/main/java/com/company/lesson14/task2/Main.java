package com.company.lesson14.task2;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "Rashad", 500);
        System.out.println(employee.toString()+"\nnet salary: " + employee.netSalary(employee.getSalary()));

        System.out.println("-----------------");

        employee.setId(2);
        employee.setName("Memmed");
        employee.setSalary(800);
        System.out.println(employee.toString()+"\nnet salary: " + employee.netSalary(employee.getSalary()));

    }
}
