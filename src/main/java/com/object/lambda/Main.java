package com.object.lambda;

public class Main {
    public static void main(String[] args) {
        Calc calc = () -> sumTwoInt(5, 3);
        System.out.println(calc);
    }

    public static int sumTwoInt(int a, int b) {
        return a + b;
    }
}
