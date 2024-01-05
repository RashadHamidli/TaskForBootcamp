package com.company.controller.algortims;

public class Alg1 {
    public static void main(String[] args) {
        int[] arr = {23, 45, 78, 22, 34};

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

}
