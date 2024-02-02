package com.company;

import java.util.concurrent.ForkJoinPool;
import java.util.logging.Logger;

public class MyTest {
    private static final Logger LOGGER = Logger.getLogger(MyTest.class.getName());

    private int count;

    public synchronized int getCountInc() {
        return count;
    }

    public synchronized void setCountInc() {
        count++;
    }


    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();

        MyTest myTest = new MyTest();
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 200000; i++) {
                myTest.setCountInc();
                System.out.println(myTest.getCountInc() + "-ci count cap edildi");
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 200000; i++) {
                myTest.setCountInc();
                System.out.println(myTest.getCountInc() + "-ci count cap edildi");
            }
        });
        Thread thread3 = new Thread(() -> {
            for (int i = 0; i < 200000; i++) {
                myTest.setCountInc();
                System.out.println(myTest.getCountInc() + "-ci count cap edildi");
            }
        });
        Thread thread4 = new Thread(() -> {
            for (int i = 0; i < 200000; i++) {
                myTest.setCountInc();
                System.out.println(myTest.getCountInc() + "-ci count cap edildi");
            }
        });
        Thread thread5 = new Thread(() -> {
            for (int i = 0; i < 200000; i++) {
                myTest.setCountInc();
                System.out.println(myTest.getCountInc() + "-ci count cap edildi");
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();
        thread5.join();

        System.out.println("count = " + myTest.count);

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;

        LOGGER.info("Proqramın işləmə vaxtı: " + duration + " millisaniyə");

    }
}
