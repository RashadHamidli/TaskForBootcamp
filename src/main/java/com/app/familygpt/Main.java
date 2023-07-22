package com.app.familygpt;

import com.app.happyFamily.Family;
import com.app.happyFamily.Human;

public class Main {
    public static void main(String[] args) {
        Human mother=new Mother("Alice", "Smith", 30, 120);
        Human father=new Father("Bob", "Smith", 35, 130);

        Family family=new Family(mother, father);

//                Family family = new Family(mother, father);

//        Human child1 = new Child("Emma", "Smith", 5, 100);
//        Human child2 = new Child("Ethan", "Smith", 8, 110);
//
//        family.addChild(child1);
//        family.addChild(child2);

        Pet pet = new Pet("Fido", "Dog");
        family.setPet(pet);

        System.out.println(family.toString());

        family.deleteChild(0);

        System.out.println(family.toString());
    }
}

