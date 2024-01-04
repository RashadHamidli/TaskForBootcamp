package com.company.controller.algortims;

public class Alg1 {
    public static void main(String[] args) {
        int[] arr = {23, 45, 78, 2, 34, 12, 5, 21, 14, 19, 42, 66, 5};

        int[] ints = ascArr(arr);
        for (int a : ints) {
            System.out.print(a + ", ");
        }
        System.out.println();

        int minArr = minNumberArr(arr);
        System.out.println("min : " + minArr);
        int maxArr = maxNumberArr(arr);
        System.out.println("max : " + maxArr);
    }

    public static int minNumberArr(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int maxNumberArr(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int[] ascArr(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

}
