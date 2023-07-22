package com.app.happyFamily;

public class Main {
    public static void main(String[] args) {
        Family family = new Family();
        family.addFather(new Father("a", "a", 1980, 100));
        family.addMother(new Mother("b", "b", 1985, 90));
        family.addChild(new Child[]{new Child("c", "c", 2000, 80), new Child("d", "d", 2005, 75)});
        System.out.println(family.toString());
    }
}
