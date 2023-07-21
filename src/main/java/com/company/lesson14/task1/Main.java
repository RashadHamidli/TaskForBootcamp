package com.company.lesson14.task1;

public class Main {
    public static void main(String[] args) {
        BancAccount bancAccount = new BancAccount();
        bancAccount.setAccNum(1);
        bancAccount.setBalance(3200);
        System.out.println("account number: " + bancAccount.getAccNum() + "\nbalance: " + bancAccount.getBalance());
    }
}
