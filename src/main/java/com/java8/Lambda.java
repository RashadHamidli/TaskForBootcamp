package com.java8;

interface ISum {
    void sum(int a, int b);
}

public class Lambda {
    public static void main(String[] args) {
        ISum sum = new ISum() {
            @Override
            public void sum(int a, int b) {
                System.out.printf("sum: %d + %d = %d ", a, b, (a + b));
            }
        };
        sum.sum(5, 3);
    }
}
