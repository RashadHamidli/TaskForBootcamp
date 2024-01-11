package com.company.algortims.algortims;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator() {
            @Override
            public double calc(double a, double b) {
                return a + b;
            }
        };
        double calc = calculator.calc(5, 3);
        System.out.println(calc);

    }
}
