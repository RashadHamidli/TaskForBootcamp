package com.company;

import java.util.concurrent.atomic.AtomicInteger;

public class MyParallelProgram {
    private Integer a = new Integer(0);
    private static AtomicInteger b = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {
//        Thread thread = new Thread(() -> {
//            for (int i = 0; i < 1000000; i++) {
//                b.incrementAndGet();
//                System.out.println(i + ". new thread running");
//            }
//        });
//        thread.setDaemon(true);
//        thread.start();

        Thread thread2 = new Thread(() -> {
            MyParallelProgram myParallelProgram = new MyParallelProgram();
            int a=0;
            for (int i = 0; i < 1000000; i++) {
                myParallelProgram.setA(++a);
            }
            Integer a1 = myParallelProgram.getA();
            System.out.println(a1);
        });
        thread2.setDaemon(true);
        thread2.start();

        Thread.sleep(3000);
        Thread thread1 = new Thread(() -> System.out.println("atomic integer b="));
        thread1.start();

    }

    public synchronized Integer getA() {
        return a;
    }

    public synchronized void setA(Integer a) {
        this.a = a;
    }

}