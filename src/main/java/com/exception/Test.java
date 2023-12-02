package com.exception;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("proqram basladi");
        try {
            BankAccount b = new BankAccount(1);
            b.deposit(500);
            System.out.println("balance: " + b.getBalance());
            while (true) {
                System.out.print("transfer meblegini daxil edin: ");
                b.transfer(scanner.nextDouble());
                System.out.println("balance: " + b.getBalance());
            }
        } catch (MyExceptionHandler e) {
            System.out.println("hesabinizda " + e.getSum() + "manat mebleg catmir");
            e.printStackTrace();
        }
        System.out.println("proqram davam edir");
    }
}
