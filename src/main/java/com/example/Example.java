package com.example;


public class Example {
    public static void main(String[] args) {
        checkDiff("salam", "salam");
    }

    public static void checkDiff(String s, String s1) {
        System.out.println(s.equals(s1));
    }

    public static void returnIndexSting(String s, int a) {
        System.out.println(s.charAt(a));
    }

    public static void foo(int a, int b, int c, int d) {
        int[] arr = {a, b, c, d};
        boolean b1 = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    b1 = true;
                }
            }
        }
        if (b1 == true)
            System.out.println("en az iki eded biri birine beraberdir");
        else
            System.out.println("butun ededler ferqlidir");
    }

    public static void foo1(int a, int b, int c, int d) {
        int[] arr = {a, b, c, d};
        boolean b1 = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                b1 = false;
                break;
            }
        }
        if (b1 == true)
            System.out.println("artandir");
        else
            System.out.println("randomdur");
    }
}


