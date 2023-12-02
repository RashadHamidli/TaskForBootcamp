package com.exception;

public class Test {
    public static void main(String[] args) {
        try {
            BankAccount b = new BankAccount(1);
            b.deposit(500);
            System.out.println("balance: " + b.getBalance());
            b.transfer(289);
            System.out.println("balance: " + b.getBalance());
            b.transfer(355);
            System.out.println("balance: " + b.getBalance());
        } catch (MyExceptionHandler e) {
            System.out.println("hesabinizda " + e.getSum() + "manat mebleg catmir");
        }
    }
}
