package com.company.algortims.algortims;

import java.util.Scanner;

public class Alg5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir rəqəm daxil edin: ");
        int number = scanner.nextInt();

        String result = convertNumberToWords(number);

        System.out.println("Hərflərlə: " + result);
    }

    private static String convertNumberToWords(int number) {
        if (number == 0) {
            return "Sıfır";
        }

        String[] wordsOnes = {"", "Bir", "Iki", "Üç", "Dörd", "Beş", "Altı", "Yeddi", "Səkkiz", "Doqquz"};
        String[] wordsTens = {"", "On", "Iyirmi", "Otuz", "Qırx", "Əlli", "Altmış", "Yetmiş", "Səksən", "Doxsan"};

        int ones = number % 10;
        int tens = (number / 10) % 10;
        int hundreds = (number / 100) % 10;

        String result = "";

        if (hundreds > 0) {
            result += wordsOnes[hundreds] + " Yüz ";
        }

        if (tens > 1) {
            result += wordsTens[tens] + " ";
            result += wordsOnes[ones];
        } else if (tens == 1) {
            result += wordsOnes[10 + ones];
        } else {
            result += wordsOnes[ones];
        }

        return result.trim();
    }
}