package com.java8;

import java.lang.reflect.Array;

@FunctionalInterface
interface MySumInt {
    void sum(double a, double b);
}

public class MyLambda {
    public static void main(String[] args) {

        MySumInt mySum = (a, b) -> System.out.println(a + b);
        mySum.sum(3.29, 5.76);

        System.out.println("---------------------");
        sum(5.25, 4.81);
    }


    public static void sum(double a, double b) {
        MySumInt sum = new MySumInt() {
            @Override
            public void sum(double a, double b) {
                System.out.printf("sum: %.2f + %.2f = %.2f ", a, b, (a + b));
            }
        };
        sum.sum(a, b);
    }
}
