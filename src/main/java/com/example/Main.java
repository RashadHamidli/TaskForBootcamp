package com.example;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        foo1(1, 5, 3, 4);
    }

    public static void foo(int a, int b, int c, int d) {
        if (a == b || a == c || a == d || b == c || b == d || c == d)
            System.out.println("en az iki eded biri birine beraberdir");
        else
            System.out.println("butun ededler ferqlidir");
    }

    public static void foo1(int a, int b, int c, int d) {
        if (d > c && c > b && b > a)
            System.out.println("artandir");
        else
            System.out.println("randomdur");
    }
}


