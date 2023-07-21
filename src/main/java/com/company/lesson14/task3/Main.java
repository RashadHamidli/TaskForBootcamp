package com.company.lesson14.task3;

public class Main {
    public static void main(String[] args) {

        Vehicle car = new Car();
        System.out.println(car.speedUp());
        Vehicle bicycle=new Bicycle();
        System.out.println(bicycle.speedUp());
    }
}
