package com.company.controller.algortims;

public class Alg1 {
    public static void main(String[] args) {
        int[] arr = {23, 45, 78, 2, 34, 12, 5, 21, 14, 19, 42, 66, 5};
        for (int print : arr) {
            System.out.print(print + ", ");
        }

        int minArr = minNumforArr(arr);
        System.out.println("min : " + minArr);

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

}
