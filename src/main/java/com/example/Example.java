package com.example;


import com.sun.source.doctree.BlockTagTree;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {

    }

    public static void fiveNumberSumAndAvg() {
        Scanner scanner = new Scanner(System.in);
        double num = 0;
        double result = 0;
        double avg = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println(i + 1 + "-ci ededi daxil edin: ");
            num = scanner.nextInt();
            result += num;
        }
        System.out.println("daxil edilen 5 ededin cemi: " + result);
        avg = result / 5;
        System.out.println("daxil edilen 5 ededin ortalamsi: " + avg);
    }

    public static void findYearDaysSwitchNewMethod() {
        Scanner input = new Scanner(System.in);

        String MonthOfName = "Unknown";

        System.out.print("Input a month number: ");
        int month = input.nextInt();

        System.out.print("Input a year: ");
        int year = input.nextInt();

        int result = switch (month) {
            case 1 -> {
                MonthOfName = "January";
                yield 31;
            }
            case 2 -> {
                MonthOfName = "February";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    yield 29;
                } else {
                    yield 28;
                }
            }
            case 3 -> {
                MonthOfName = "March";
                yield 31;
            }
            case 4 -> {
                MonthOfName = "April";
                yield 30;
            }
            case 5 -> {
                MonthOfName = "May";
                yield 31;
            }
            case 6 -> {
                MonthOfName = "June";
                yield 30;
            }
            case 7 -> {
                MonthOfName = "July";
                yield 31;
            }
            case 8 -> {
                MonthOfName = "August";
                yield 31;
            }
            case 9 -> {
                MonthOfName = "September";
                yield 30;
            }
            case 10 -> {
                MonthOfName = "October";
                yield 31;
            }
            case 11 -> {
                MonthOfName = "November";
                yield 30;
            }
            case 12 -> {
                MonthOfName = "December";
                yield 31;
            }
            default -> throw new IllegalStateException("Ay duzgun daxil edilmeyib: " + month);
        };
        System.out.print(MonthOfName + " " + year + " has " + result + " days\n");
    }

    public static void findYearDaysSwitchSimple() {
        Scanner input = new Scanner(System.in);

        int number_Of_DaysInMonth = 0;
        String MonthOfName = "Unknown";

        System.out.print("Input a month number: ");
        int month = input.nextInt();

        System.out.print("Input a year: ");
        int year = input.nextInt();

        switch (month) {
            case 1:
                MonthOfName = "January";
                number_Of_DaysInMonth = 31;
                break;
            case 2:
                MonthOfName = "February";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    number_Of_DaysInMonth = 29;
                } else {
                    number_Of_DaysInMonth = 28;
                }
                break;
            case 3:
                MonthOfName = "March";
                number_Of_DaysInMonth = 31;
                break;
            case 4:
                MonthOfName = "April";
                number_Of_DaysInMonth = 30;
                break;
            case 5:
                MonthOfName = "May";
                number_Of_DaysInMonth = 31;
                break;
            case 6:
                MonthOfName = "June";
                number_Of_DaysInMonth = 30;
                break;
            case 7:
                MonthOfName = "July";
                number_Of_DaysInMonth = 31;
                break;
            case 8:
                MonthOfName = "August";
                number_Of_DaysInMonth = 31;
                break;
            case 9:
                MonthOfName = "September";
                number_Of_DaysInMonth = 30;
                break;
            case 10:
                MonthOfName = "October";
                number_Of_DaysInMonth = 31;
                break;
            case 11:
                MonthOfName = "November";
                number_Of_DaysInMonth = 30;
                break;
            case 12:
                MonthOfName = "December";
                number_Of_DaysInMonth = 31;
        }
        System.out.print(MonthOfName + " " + year + " has " + number_Of_DaysInMonth + " days\n");
    }

    public static String swapCase(String text) {
        StringBuilder sb = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isLowerCase(c)) {
                sb.append(Character.toUpperCase(c));
            } else if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String swapCaseSimple(String text) {
        String s = "";
        for (int i = 0; i < text.length(); i++) {
            Character c = text.charAt(i);
            if (c.isLowerCase(c)) {
                s += (c.toUpperCase(c));
            } else if (c.isUpperCase(c)) {
                s += (c.toLowerCase(c));
            } else {
                s += (c);
            }
        }
        return s;
    }

    public static String twoStringCompareTo(String s, String s1) {
        int i = s.length();
        int i1 = s1.length();
        if (i > i1)
            return s;
        else if (i < i1)
            return s1;
        return "her iki soz eynidir: " + s;
    }

    public static void foo(String s, int a, int b) {
        String ss = s.substring(a, b);
        for (int i = 0; i < ss.length(); i++) {
            System.out.println(ss.charAt(i));
        }
    }

    public static void twoStringContainsThree(String a, String b, String c) {
        if (a.contains(c) && b.contains(c))
            System.out.println("1ci ve 2ci sozler her ikisi 3cu sozu ehate edir");
        else
            System.out.println("1ci ve 2ci soz 3cunu ehate etmirler");

    }

    public static void stringAdd(String s, char c, int num) {
        for (int i = 0; i < num; i++) {
            s += c;
        }
        System.out.println(s);
    }

    public static void checkDiff(String s, String s1) {
        System.out.println(s.equals(s1));
    }

    public static void returnIndexSting(String s, int a) {
        System.out.println(s.charAt(a));
    }

    public static void foo(int a, int b, int c, int d) {
        int[] arr = {a, b, c, d};
        boolean b1 = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    b1 = true;
                }
            }
        }
        if (b1 == true)
            System.out.println("en az iki eded biri birine beraberdir");
        else
            System.out.println("butun ededler ferqlidir");
    }

    public static void foo1(int a, int b, int c, int d) {
        int[] arr = {a, b, c, d};
        boolean b1 = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                b1 = false;
                break;
            }
        }
        if (b1 == true)
            System.out.println("artandir");
        else
            System.out.println("randomdur");
    }
}


