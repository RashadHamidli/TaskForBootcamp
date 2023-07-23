package com.app.pet;

public class Main {
    public static void main(String[] args) {
        Man man = new Man("John", "Braun", 25);
        System.out.println(man.repairCar());
        Woman woman = new Woman("Emma", "Braun", 25);
        System.out.println(woman.makeUp());
        Pet fish = new Fish();
        System.out.println(fish.eat());
        Pet domesticCat = new DomesticCat();
        System.out.println(domesticCat.eat());
        Pet dog = new Dog();
        System.out.println(dog.eat());
        Pet roboCat = new RoboCat();
        System.out.println(roboCat.eat());
    }
}
