package com.app.happyFamily;

public class Main {
    public static void main(String[] args) {
        Family family = new Family();
        family.addChild(new Child("rashad", "Hamidli", 20, 5));
        System.out.println(family.toString());

    }
}
