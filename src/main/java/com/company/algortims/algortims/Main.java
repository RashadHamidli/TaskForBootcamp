package com.company.algortims.algortims;

import jdk.jfr.StackTrace;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<ArrayList> myVar=new ArrayList<>();
        int size = myVar.size();
        System.out.println(size);
        String str1 = "Hello";
        String str2 = new String("Hello");
        String str3 = "Hello";
        System.out.println(str1.equals(str2));
        try {
            int result = 5 / 0;
        } catch (ArithmeticException e) {
            String localizedMessage = e.getLocalizedMessage();
            System.out.println("LocalizedMessage: " + localizedMessage);
        }
        Calculator calculator = new Calculator() {
            @Override
            public double calc(double a, double b) {
                return a + b;
            }
        };
        double calc = calculator.calc(5, 3);
        System.out.println(calc);


        Integer reduce = Stream.of(3, 4, 5).reduce(0, Integer::sum);
        System.out.println(reduce);

    }
}
