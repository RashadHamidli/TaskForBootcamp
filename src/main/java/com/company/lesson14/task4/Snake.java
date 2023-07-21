package com.company.lesson14.task4;

public class Snake extends Animal{
    @Override
    public String makeSound() {
        return getClass().getSimpleName()+" sound";
    }
}
