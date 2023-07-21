package com.company.lesson14.task3;

import static java.lang.System.out;

public class Bicycle extends Vehicle{
    @Override
    public double speedUp() {
        return super.speedUp()+15;
    }
}
