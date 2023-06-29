package com.example;

import java.util.Scanner;


public class Main {
    private static final String[] teklik = {"", "bir", "iki", "uc", "dord", "bes", "alti", "yeddi", "sekkiz", "doqquz"};
    private static final String[] onluq = {"", "", "iyirmi", "otuz", "qirx", "elli", "altimis", "yetmis", "seksen", "doxsan"};
    private static final String[] araliq = {"", "on bir", "on iki", "on uc", "on dord", "on bes", "on alti", "on yeddi", "on sekkiz", "on doqquz"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ededi daxil edin: ");
        int eded = scanner.nextInt();
        String s = convertToWords(eded);
        System.out.println("ededin herfle yazilisi: " + s);
    }

    public static String convertToWords(int eded) {
        if (eded == 0)
            return "sifir";
        if (eded < 0)
            return "menfi" + convertToWords(-eded);
        String words = "";
        if (eded / 1000 > 0) {
            words += teklik[eded / 1000] + " min ";
            eded %= 1000;
        }
        if (eded / 100 > 0) {
            words += teklik[eded / 100] + " yuz ";
            eded %= 100;
        }
        if (eded / 10 > 1) {
            words += onluq[eded / 10] + "";
            eded %= 10;
        } else if (eded < 10) {
            words += teklik[eded];
            eded = 0;
        } else {
            words += araliq[eded - 10];
            eded = 0;
        }
        if (eded > 0)
            words += teklik[eded];

        return words;
    }


}
