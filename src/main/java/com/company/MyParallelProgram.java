package com.company;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class MyParallelProgram {

    private static final Object resource1 = new Object();
    private static final Object resource2 = new Object();

    public static void main(String[] args) throws InterruptedException {

        Callable<String> callable = new Callable<String>() {
            @Override
            public String call() {
                return "call method";
            }
        };

        FutureTask<String> futureTask = new FutureTask<>(callable);
        Thread thread = new Thread(new FutureTask<>(callable));
        thread.start();

        // Nəticəni almaq üçün futureTask obyektindən istifadə edə bilərsiniz
        try {
            String result = futureTask.get();
            System.out.println("Thread returned: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }


        //        Thread thread1 = new Thread(() -> {
//            synchronized (resource1) {
//                System.out.println("Thread 1 locked resource 1");
//                try {
//                    Thread.sleep(100);
//                    if(Thread.holdsLock(resource1)){
//                    resource1.wait();
//                    }
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println("Thread 1 waiting for resource 2");
//                synchronized (resource2) {
//                    System.out.println("Thread 1 locked resource 2");
//                }
//                return ;
//            }
//        });
//
//        Thread thread2 = new Thread(() -> {
//            synchronized (resource2) {
//                System.out.println("Thread 2 locked resource 2");
//                try {
//                    Thread.sleep(100);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println("Thread 2 waiting for resource 1");
//                synchronized (resource1) {
//                    resource1.notify();
//                    System.out.println("Thread 2 locked resource 1");
//                }
//            }
//        });
//
//        thread1.start();
//        thread2.start();
//        System.out.println("kod bitdi");

    }

}