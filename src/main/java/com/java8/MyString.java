package com.java8;

import java.util.Scanner;

public class MyString {
    public static void main(String[] args) {
        print(5);
        print("salam");
        print('a');
    }

    public static void print(Object inputName) {
        var name = inputName;
            if (name instanceof String myName && !myName.isEmpty()) {
                System.out.println(myName.getClass().getSimpleName());
            } else {
                System.out.println(name.getClass().getSimpleName());
            }
    }
}
