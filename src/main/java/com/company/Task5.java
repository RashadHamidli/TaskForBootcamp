package com.company;

import java.awt.*;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

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
