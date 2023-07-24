package com.company.lesson2_8;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        sumOfInt();
    }
    public static void findLargestNumberByIfAndElse() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1ci ededi daxil edin: ");
        int a = scanner.nextInt();

        System.out.print("1ci ededi daxil edin: ");
        int b = scanner.nextInt();

        System.out.print("1ci ededi daxil edin: ");
        int c = scanner.nextInt();

        int min, max;

        if (a <= b && a <= b)
            min = a;
        else if (b <= a && b <= b)
            min = b;
        else
            min = b;

        if (a >= b && a >= b)
            max = a;
        else if (b >= a && b >= b)
            max = b;
        else
            max = b;

        System.out.println("En kicik eded: " + min);
        System.out.println("En boyuk eded: " + max);

        scanner.close();
    }

    public static void findLargestNumberByTernaryOperator() {
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

    public static void findDayOfWeekBySwitch() {
        Scanner scanner = new Scanner(System.in);
        int dayOfWeek = scanner.nextInt();
        switch (dayOfWeek) {
            case 1:
                System.out.println("Bazar Ertesi");
                break;
            case 2:
                System.out.println("Cersenbe Axsami");
                break;
            case 3:
                System.out.println("Cersenbe");
                break;
            case 4:
                System.out.println("Cume Axsami");
                break;
            case 5:
                System.out.println("Cume");
                break;
            case 6:
                System.out.println("Senbe");
                break;
            case 7:
                System.out.println("Bazar");
                break;
            default:
                System.out.println("heftenin gunu duzgun daxil edilmeyib");
        }
        scanner.close();
    }

    public static void findDayOfWeekByNewSwitchMethod() {
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

    public static void divideNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ədədi daxil edin: ");
        Double number = scanner.nextDouble();

        if (number % 2 == 0 && number % 3 == 0)
            System.out.println("eded 2-ye ve 3e bolunur");
        else
            System.out.println("eded 2-ye ve 3e bolunmur");

        scanner.close();
    }
    public static void perimetrOfTriangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ucbucagin tereflerinin uzunluqlarini daxil edin");
        double length1 = scanner.nextDouble();
        double length2 = scanner.nextDouble();
        double length3 = scanner.nextDouble();
        double perimetr = (length1 + length2 + length3);
        System.out.println("ucbucagin perimetri: " + perimetr);
    }

    public static void areaAndPerimetrOfRegtangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("duzbucaqlinin enini daxil edin: ");
        double breadth = scanner.nextDouble();
        System.out.print("duzbucaqlinin uzunlugunu daxil edin: ");
        double length = scanner.nextDouble();
        double area = breadth * length;
        double perimetr = 2 * (breadth + length);
        System.out.println("duzbucalinin sahesi: " + area);
        System.out.println("duzbucaqlinin perimetri: " + perimetr);
        scanner.close();
    }

    public static void sumOfInt() {
        System.out.println("ededi daxil edin: ");
        Scanner scanner = new Scanner(System.in);
        int eded = scanner.nextInt();
        int result = 0;
        for (int i = eded; i != 0; i /= 10) {
            int a = i % 10;
            result += a;
        }
        System.out.println(result);
    }
    public static void checkUserNameAndPassword() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("istifadeci adini daxil edin: ");
        String name = scanner.nextLine();
        System.out.print("istifadeci parolunu daxil edin: ");
        String password = scanner.nextLine();
        String userName = "admin";
        String userPassword = "admin";
        if (name.equals(userName) && password.equals(userPassword))
            System.out.println("sisteme daxil oldunuz");
        else
            System.out.println("istifadeci adi ve ya parol yanlisdir");
        scanner.close();
    }
}
