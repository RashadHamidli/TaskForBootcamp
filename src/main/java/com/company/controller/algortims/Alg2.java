package com.company.controller.algortims;

public class Alg2 {
    public static void main(String[] args) {
        int[] arr = {3, 13, 12, 6, 5, 16, 19};
        ascArr(arr);
        for (int asc : arr) {
            System.out.print(asc + ", ");
        }
        System.out.println();
        descArr(arr);
        for (int desc : arr) {
            System.out.print(desc + ", ");
        }
    }

    public static void descArr(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int a = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = a;
                }
            }
        }
    }

    public static void ascArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
