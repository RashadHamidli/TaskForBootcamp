package com.company.lesson16.task3;

public class Main {
    public static void main(String[] args) {
        User<Integer, String> user1 = new User<>(42, "Merhaba");
        User<Double, Character> user2 = new User<>(3.14, 'X');

        Integer reqem = user1.getFirstPerson();
        String soz = user1.getSecondPerson();

        Double kesr = user2.getFirstPerson();
        Character herf = user2.getSecondPerson();

        System.out.println("User 1: " + reqem + " ve " + soz);
        System.out.println("User 2: " + kesr + " ve " + herf);
    }
}
