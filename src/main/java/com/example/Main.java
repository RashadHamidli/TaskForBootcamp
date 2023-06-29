package com.example;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
    }

    public static void foo(int a, int b, int c) {
        for (int i = a; i <= b; i++) {
            double pow = Math.pow(i, c);
            System.out.println(i + " ^ " + c + " = " + pow);
        }
    }

}
