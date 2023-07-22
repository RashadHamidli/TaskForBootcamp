package com.app.family;

public class Main {
    public static void main(String[] args) {
        Mother mother = new Mother("Alice", "Smith", 30, 120);
        Father father = new Father("Bob", "Smith", 35, 130);

        Family family = new Family(mother, father);

        Child child1 = new Child("Emma", "Smith", 5, 100);
        Child child2 = new Child("Ethan", "Smith", 8, 110);

        family.addChild(child1);
        family.addChild(child2);

        Pet pet = new Pet("it", "Dog");
        Pet pet1 = new Pet("pisik", "Cat");
        family.setPet(pet);
        family.setPet(pet1);
        System.out.println(family.toString());

        System.out.println("Count family: " + family.countFamily());

        System.out.println("------------------");

        family.deleteChild(0);

        System.out.println(family.toString());

        System.out.println("Count family: " + family.countFamily());
    }
}

