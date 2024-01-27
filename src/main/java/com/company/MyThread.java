package com.company;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("thread basladildi");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("thread isini bitirdi");

    }
}
