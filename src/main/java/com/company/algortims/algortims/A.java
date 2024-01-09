package com.company.algortims.algortims;

public class A {
    private String name;
    private int age;
    private double salary;
    private boolean b;

    public A() {
    }

    public A(String name, int age, double salary,boolean b) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.b=b;
    }

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.name);
        System.out.println(a.age);
        System.out.println(a.salary);
        System.out.println(a.b);

    }
}
