package com.app.pet;

public class Fish extends Pet{

    @Override
    public String eat() {
        return getClass().getSimpleName()+" eating";
    }
}
