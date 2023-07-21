package com.company.lesson14.task1;

public class BancAccount {
    private int accNum;
    private double balance;

    public BancAccount() {
    }

    public BancAccount(int accNum, double balance) {
        this.accNum = accNum;
        this.balance = balance;
    }

    public int getAccNum() {
        return accNum;
    }

    public void setAccNum(int accNum) {
        this.accNum = accNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
