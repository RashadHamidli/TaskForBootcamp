package com.app.pet;

public class Dog extends Pet{
    @Override
    public String eat() {
        return getClass().getSimpleName()+" eating";
    }
}
