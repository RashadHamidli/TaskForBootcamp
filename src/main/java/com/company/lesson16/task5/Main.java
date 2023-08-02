package com.company.lesson16.task5;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        CreateCode createCode = new CreateCode();
        String s = "---------------";
        System.out.println(s + "\n<Yaradilan Lisenziya acari>\n" + s);
        for (int i = 0; i < 5; i++) {
            System.out.println("-> Yaradilan " + (i + 1) + ". Lisenziya Acari: " + createCode.newCode() + "\n" + s);
        }
    }
}
