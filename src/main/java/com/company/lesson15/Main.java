package com.company.lesson15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        primeNumber();
    }

    public static void primeNumber() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        PrimeNumber primeNumber = num -> {
            for (int i = 2; i <= num; i++) {
                boolean b = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        b = false;
                        break;
                    }
                }
                if (b) {
                    System.out.print(i + " ");
                }
            }
        };
        primeNumber.primeNum(number);
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

    public static void findOddOrEvenNumber() {
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
