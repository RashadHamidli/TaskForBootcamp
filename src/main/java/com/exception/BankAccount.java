package com.exception;

public class BankAccount {
    private int number;
    private double balance;

    public BankAccount(int number) {
        this.number = number;
    }

    public void deposit(double sum) {
        balance += sum;
    }

    public void transfer(double sum) throws MyExceptionHandler {
        if (sum <= balance) {
            balance -= sum;
        }
        else {
            double needs=sum-balance;
            throw new MyExceptionHandler(needs);
        }
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }
}
