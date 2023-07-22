package com.app.familygpt;

public class Main {
    public static void main(String[] args) {
        Human mother = new Human("Alice", "Smith", 30, 120);
        Human father = new Human("Bob", "Smith", 35, 130);

        Family family = new Family(mother, father);

        Human child1 = new Human("Emma", "Smith", 5, 100);
        Human child2 = new Human("Ethan", "Smith", 8, 110);

        family.addChild(child1);
        family.addChild(child2);

        Pet pet = new Pet("Fido", "Dog");
        family.setPet(pet);

        System.out.println(family.toString());

        family.deleteChild(0);

        System.out.println(family.toString());
    }
}

