package com.example;

import java.util.Scanner;

public class Exam1 {
    public static void main(String[] args) {
        tersDuzYoxlamaq();
    }

    public static void tersDuzYoxlamaq() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ededi daxil edin: ");
        int eded = scanner.nextInt();
        int temp = eded;
        int tersEded = 0;

        while (temp != 0) {
            int sonReqem = temp % 10;
            tersEded = tersEded * 10 + sonReqem;
            temp /= 10;
        }
        if (eded == tersEded)
            System.out.println("ededin duzu ve tersi eynidir");
        else
            System.out.println("ededin duzu ve tersi ferqlidir");

    }

    public static void reqemlerinSayi() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ededi daxil edin: ");
        int number = scanner.nextInt();
        int say = 0;
        while (number > 0) {
            number /= 10;
            say++;
        }
        System.out.println("ədədin rəqəmlərinin sayı: " + say + "-dir");
    }

    public static void sumIntWhile() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int result = 0;
        while (number > 0) {
            result += number % 10;
            number /= 10;
        }
        System.out.println("ededin reqemleri cemi: " + result);
    }

    public static void sumIntFor() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ededi daxil edin: ");
        int number = scanner.nextInt();
        int result = 0;
        for (int i = 0; i < number; number /= 10)
            result += number % 10;
        System.out.println("ededin reqemleri cemi: " + result);
    }

    public static void divideTwoNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ededi daxil edin: ");
        int eded = scanner.nextInt();
        for (int i = 0; i < eded; i++) {
            if (i % 2 == 0)
                System.out.println("ededler 2ye bolunur: " + i);
        }
        scanner.close();
    }

    public static void divideNumbersByScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ededi daxil edin: ");
        int eded = scanner.nextInt();
        System.out.print("bolmek istediyiniz ededi daxil edin: ");
        int bolmek = scanner.nextInt();
        for (int i = 0; i < eded; i++) {
            if (i % bolmek == 0)
                System.out.println(i + " ededi " + bolmek + "e bolunur: ");
        }
        scanner.close();
    }

    public static void findSimpleNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ededi daxil edin: ");
        int number = scanner.nextInt();
        for (int i = 2; i <= number; i++) {
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
    }


}
