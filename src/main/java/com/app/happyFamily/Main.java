package com.app.happyFamily;

public class Main {
    public static void main(String[] args) {
        Family family = new Family();
        family.addFather(new Father("John", "Green", 1980, 100));
        family.addMother(new Mother("agarg", "afarfg", 1985, 90));
        family.addChild(new Child[]{new Child("a", "b", 1, 1), new Child("c", "c", 2, 2)});
        System.out.println(family);

    }
}
