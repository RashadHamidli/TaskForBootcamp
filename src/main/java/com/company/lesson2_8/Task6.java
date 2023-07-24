package com.company.lesson2_8;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        arrMaxAndMinElem();
    }
    public static void arrMaxAndMinElem() {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        int max = arr[0], min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("elementi daxil edin: ");
            arr[i] = scanner.nextInt();
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("En kicik deyer: " + min);
        System.out.println("En büyük deyer: " + max);
    }

    public static void findIndexArr() {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5};
        System.out.print("ededi daxil edin: ");
        int num = scanner.nextInt();
        int result = 0;
        boolean b = false;
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                b = true;
                break;
            }
            result++;
        }
        if (b)
            System.out.println("result=" + result);
        else
            System.out.println(-1);
    }


    public static void findElemArr() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ededi daxil edin: ");
        int num = scanner.nextInt();
        int[] arr = {1, 2, 3, 4, 5};
        boolean b = true;
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];
            if (a == num) {
                System.out.println("element massivde var");
                b = false;
                break;
            }
        }
        if (b) {
            System.out.println("element massivde tapilmadi");
        }
    }


    public static void avgElemArr() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("arrayin olcusunu daxil edin: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        int result = 0;
        int avg = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print("elementi daxil edin: ");
            arr[i] = scanner.nextInt();
            result += arr[i];
            avg = result / arr.length;
        }
        System.out.println("arrayin orta qiymeti=" + avg);
    }

    public static void sumElemArr() {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print("ededi daxil edin: ");
            arr[i] = scanner.nextInt();
            result += arr[i];
        }
        System.out.println("massivdeki ededlerin cemi=" + result);
    }
}
