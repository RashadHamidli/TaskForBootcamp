package com.company.lesson14.task2;

public class Employee {
    private int id;
    private String name;
    private double salary;

    public double netSalary(double salary){
        return salary-(salary*0.24);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "id=" + id + ", name='" + name  +", salary=" + salary;
    }
}
