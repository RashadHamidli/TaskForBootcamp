package com.object.lambda;

public class AverageCalculator {
    public static void main(String[] args) {
        double[] numbers = { 2.5, 3.5, 4.5, 5.5, 6.5 };

        // Lambda ifadesi ile dizinin ortalamasını bulma
        double average = calculateAverage(numbers);

        System.out.println("Original Array:");
        printArray(numbers);
        System.out.println("Average: " + average);
    }

    // Lambda ifadesi ile dizinin ortalamasını bulma
    private static double calculateAverage(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // Diziyi ekrana yazdırmak için yardımcı metot
    private static void printArray(double[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

