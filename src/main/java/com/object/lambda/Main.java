package com.object.lambda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


    }

    public static void sumCalc() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the number: ");
        double num1 = scanner.nextDouble();
        System.out.print("enter the number: ");
        double num2 = scanner.nextDouble();

        Sum sum = (a, b) -> a + b;
        double result = sum.sumTwoInt(num1, num2);
        System.out.println(result);
    }
    public static void findOddOrEvenNumber(){
        int[] arr = {1, 3, 4, 9, 6, 5, 2, 7, 8};

        Numb number = num -> {
            for (int n : num) {
                if (n % 2 == 0) {
                    System.out.println(n + " is odd number");
                } else {
                    System.out.println(n + " is even number");
                }
            }
            return true;
        };
        number.num(arr);
    }
    public static void avrgCalc() {
        double[] arr = {1, 3, 4, 9, 6, 5, 2, 7, 8};

        ArrayAverage avrg = array -> {
            double sum = 0;
            for (double num : array) {
                sum += num;
            }
            return sum / array.length;
        };

        System.out.println(avrg.calcAverage(arr));
    }
}
