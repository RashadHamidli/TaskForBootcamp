package com.example;

import javax.swing.plaf.synth.SynthTabbedPaneUI;
import java.util.Scanner;

public class Divid {
    public static void main(String[] args) {
        findSimpleNumber();
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
