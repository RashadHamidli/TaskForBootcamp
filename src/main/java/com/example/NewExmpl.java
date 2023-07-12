package com.example;

public class NewExmpl {
    public static void main(String[] args) {
        int number = 123456789;
        int result = 0;
        while (number != 0) {
            int digit = number % 10;
            result = result * 10 + digit;
            number /= 10;
        }
        System.out.println("oppoiste number " + result);
    }

    public static void opposingString() {
        String s = "123456789";
        char[] charArray = s.toCharArray();
        String a = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            a += charArray[i];
        }
        System.out.println(a);
    }

    public static void opposinngStringBuilder() {
        String s = "123456789";
        char[] charArray = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(charArray[i]);
        }
        System.out.println(sb.toString());
    }
}
