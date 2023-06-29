package com.example;

import java.util.Scanner;

public class Divid {
    public static void main(String[] args) {

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
    public static void divideNumbersByScanner(){
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
}
