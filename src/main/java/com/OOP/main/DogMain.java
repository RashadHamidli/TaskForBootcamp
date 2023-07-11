package com.OOP.main;

import com.OOP.entity.Dog;

public class DogMain {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.setName("dog");
        dog.setBreed("pitbull");
        System.out.println(dog);
    }
}
