package com.app.bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        System.out.println("Kredit secin");
        System.out.println("1. Ipoteka \n2. Gundelik");
        int type = scanner.nextInt();
        System.out.print("promokod varsa daxil edin: ");
        String promo = sc.nextLine();
        System.out.print("kredit meblegini daxil edin: ");
        int period = scanner.nextInt();
        System.out.print("kredit muddetini daxil edin: ");
        int sum = scanner.nextInt();

        while (true) {
            switch (type) {
                case 1:
                    Ipoteka i = new Ipoteka(sum, period);
                    System.out.println(i);
                    return;
                case 2:
                    DailyDemand d = new DailyDemand(sum, period);
                    System.out.println(d);
                    return;
                default:
                    System.out.print("Duzgun teyin etmediniz, tekrar secim edin: ");
                    type = scanner.nextInt();
            }
        }
    }
}
