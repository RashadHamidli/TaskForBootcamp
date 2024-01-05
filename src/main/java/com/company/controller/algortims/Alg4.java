package com.company.controller.algortims;

public class Alg4 {
    public static void main(String[] args) {
        int reqem = 0;
        String word = "iyirmi bes";
        String[] s = word.split(" ");
        int[] a = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        String[] b = {"sifir", "bir", "iki", "uc", "dord", "bes", "alti", "yeddi", "sekkiz", "doqquz", "on", "iyirmi", "otuz", "qirx", "elli", "altimis", "yetmis", "seksen", "doxsan", "yuz"};

        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (s[i].equals(b[j])) {
                    reqem += a[j];
                    break;
                }
            }
        }

        System.out.println(reqem);
    }
}

