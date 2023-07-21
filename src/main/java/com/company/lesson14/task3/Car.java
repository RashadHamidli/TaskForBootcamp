package com.company.lesson14.task3;

public class Car extends Vehicle {
    @Override
    public double speedUp() {
        return super.speedUp()+15;
    }
}
