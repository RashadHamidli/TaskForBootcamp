package com.company.algortims.algortims;

import java.util.Scanner;

public class Alg3 {
    public static void main(String[] args) {
        String enter = "yuz iyirmi bes";
        String[] soz = {"sifir", " bir", "iki", "uc", "dord", "bes", "alti", "yeddi", "sekkiz", "doqquz", "on", "iyirmi", "otuz", "qirx", "elli", "altimis", "yetmis", "seksen", "doxsan", "yuz"};
        int[] reqem = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int result = 0;
        String[] s = enter.split(" ");
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < soz.length; j++) {
                if (s[i].equals(soz[j])) {
                    result += reqem[j];
                    break;
                }
            }
        }
        System.out.println(result);
    }
}
