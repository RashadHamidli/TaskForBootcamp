package com.company;

import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        foo1();
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("1ci ededi daxil edin: ");
//        int number1 = scanner.nextInt();
//
//        System.out.print("1ci ededi daxil edin: ");
//        int number2 = scanner.nextInt();
//
//        System.out.print("1ci ededi daxil edin: ");
//        int number3 = scanner.nextInt();
//
//        int min, max;
//
//        if (number1 <= number2 && number1 <= number3) {
//            min = number1;
//        } else if (number2 <= number1 && number2 <= number3) {
//            min = number2;
//        } else {
//            min = number3;
//        }
//
//        if (number1 >= number2 && number1 >= number3) {
//            max = number1;
//        } else if (number2 >= number1 && number2 >= number3) {
//            max = number2;
//        } else {
//            max = number3;
//        }
//
//        System.out.println("En kicik eded: " + min);
//        System.out.println("En boyuk eded: " + max);
//
//        scanner.close();
    }

    public static void foo1() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1ci ededi daxil edin: ");
        int a = scanner.nextInt();

        System.out.print("1ci ededi daxil edin: ");
        int b = scanner.nextInt();

        System.out.print("1ci ededi daxil edin: ");
        int c = scanner.nextInt();

        int min = (a < b) ? ((a < c) ? a : c) : ((b < c) ? b : c);
        int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);

        System.out.println("En kicik eded: " + min);
        System.out.println("En boyuk eded: " + max);

        scanner.close();
    }

    public static void foo() {
        Scanner scanner = new Scanner(System.in);
        int dayOfWeek = scanner.nextInt();
        switch (dayOfWeek) {
            case 1 -> System.out.println("Bazar Ertesi");
            case 2 -> System.out.println("Cersenbe Axsami");
            case 3 -> System.out.println("Cersenbe");
            case 4 -> System.out.println("Cume Axsami");
            case 5 -> System.out.println("Cume");
            case 6 -> System.out.println("Senbe");
            case 7 -> System.out.println("Bazar");
            default -> System.out.println("heftenin gunu duzgun daxil edilmeyib");
        }
        scanner.close();
    }

    public static void bolunme() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ədədi daxil edin: ");
        Double number = scanner.nextDouble();

        if (number % 2 == 0 && number % 3 == 0)
            System.out.println("eded 2-ye ve 3e bolunur");
        else
            System.out.println("eded 2-ye ve 3e bolunmur");

        scanner.close();
    }
}
