package com.object.lambda;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        audibleMehtod(dog);
    }

    public static void audibleMehtod(Audible audible) {
        audible.makeNoise();
    }
}
