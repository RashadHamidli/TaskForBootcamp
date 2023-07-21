package com.company.lesson14.task4;

public class Wolf extends Animal{
    @Override
    public String makeSound() {
        return getClass().getSimpleName()+" sound";
    }
}
