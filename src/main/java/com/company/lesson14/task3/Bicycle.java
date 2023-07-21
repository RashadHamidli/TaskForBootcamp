package com.company.lesson14.task3;

public class Bicycle extends Vehicle{
    @Override
    public double speedUp() {
        return super.speedUp()+15;
    }
}
