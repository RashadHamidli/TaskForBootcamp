package com.app.familygpt;

public class Main {
    public static void main(String[] args) {
        Mother mother = new Mother("Alice", "Smith", 30, 120);
        Father father = new Father("Bob", "Smith", 35, 130);
        Family family = new Family(mother, father);

        Child child1 = new Child("Emma", "Smith", 5, 100);
        Child child2 = new Child("Ethan", "Smith", 8, 110);

        family.addChild(child1);
        family.addChild(child2);

        Pet pet = new Pet("Fido", "Dog");
        family.setPet(pet);

        System.out.println(family.toString());

        family.deleteChild(0);

        System.out.println(family.toString());
    }
}

