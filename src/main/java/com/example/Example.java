package com.example;


public class Example {
    public static void main(String[] args) {
        foo("Hello World", 3, 7);
    }

    public static void foo(String s, int a, int b) {
        String ss = s.substring(a, b);
        for (int i = 0; i < ss.length(); i++) {
            System.out.println(ss.charAt(i));
        }
    }

    public static void foo(String a, String b, String c) {
        if (a.contains(c) && b.contains(c))
            System.out.println("1ci ve 2ci sozler her ikisi 3cu sozu ehate edir");
        else
            System.out.println("1ci ve 2ci soz 3cunu ehate etmirler");

    }

    public static void foo(String s, char c, int num) {
        for (int i = 0; i < num; i++) {
            s += c;
        }
        System.out.println(s);
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


