package com.app.bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("kredit meblegini daxil edin: ");
        int period = scanner.nextInt();
        System.out.print("kredit muddetini daxil edin: ");
        int sum = scanner.nextInt();
        System.out.println("1. Ipoteka \n2. Gundelik");
        int type = scanner.nextInt();
        switch (type) {
            case 1 -> {
                Ipoteka ipoteka = new Ipoteka(sum, period);
                System.out.println(ipoteka);
            }
            case 2 -> {
                DailyDemand dailyDemand = new DailyDemand(sum, period);
                System.out.println(dailyDemand);
            }
        }
    }
}
