package com.company;

public class Main {
    public static void main(String[] args) {
        Thread threadA = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(i + " A" + Thread.currentThread());
            }
        });
        Thread threadB = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(i + " B" + Thread.currentThread());
            }
        });

        Thread threadC=new Thread(() -> {
            for (int i = 0; i <5; i++) {
                System.out.println(i + " C" + Thread.currentThread());
            }
        });

        threadA.start();
        threadB.start();
        threadC.start();
    }
}
