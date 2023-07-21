package com.company.lesson14.task2;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "Rashad", 500);
        System.out.println(employee.toString()+"\nnet salary: " + employee.netSalary(employee.getSalary()));

        System.out.println("-----------------");

        Employee e = new Employee();
        e.setId(2);
        e.setName("Memmed");
        e.setSalary(800);
        System.out.println(e.toString()+"\nnet salary: " + e.netSalary(e.getSalary()));

    }
}
