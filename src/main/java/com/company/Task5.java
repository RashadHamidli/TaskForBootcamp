package com.company;

import java.awt.*;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

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
        System.out.print("eded daxil edin: ");
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
        int[] arr = new int[5];
        int result = 0;
        int avg = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print("ededi daxil edin: ");
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


    public static void printEvenNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ededi daxil edin: ");
        int num = scanner.nextInt();
        for (int i = 1; i < num; i++) {
            if (i % 2 == 0)
                System.out.print(i + ", ");
        }
    }

    public static void printA_Z() {
        for (char c = 65; c <= 90; c++) {
            System.out.println(c);
        }
    }

    public static void numberMultipleAllNumberOneUntilTen() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ededi daxil edin: ");
        int num = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            int result = num * i;
            System.out.println(num + " * " + i + " = " + result);
            scanner.close();
        }
    }
}
