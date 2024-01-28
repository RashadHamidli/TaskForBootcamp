package com.company;


import java.util.TreeMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Logger;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

//    public static void main(String[] args) throws InterruptedException {
//
//        Thread thread1 = new Thread(() -> {
//            for (int i = 0; i < 1000000; i++) {
//                Email email = new Email("b", "bb");
//                System.out.println(email);
//            }
//        });
//
//        Thread thread2 = new Thread(() -> {
//            for (int i = 0; i < 1000000; i++) {
//                Task task = new Task("b", "bb");
//                System.out.println(task);
//            }
//        });
//
//        thread1.start();
//        thread2.start();
//    }
public static void main(String[] args) throws InterruptedException {

    Email email = null;
    for (int i = 0; i < 1000000; i++) {
        email = new Email("a", "aa");
        System.out.println(email);
    }
    Task task = null;
    for (int i = 0; i < 1000000; i++) {
        task = new Task("b", "bb");
        System.out.println(task);
    }
}

    public static void foo() {

        long startTime = System.currentTimeMillis();
        LOGGER.info("Emeliyyat başladı.");
        Task task = null;
        for (int i = 0; i < 1000000; i++) {
            task = new Task("a", "aa");
            System.out.println(task);
        }
        Email email = null;
        for (int i = 0; i < 1000000; i++) {
            email = new Email("b", "bb");
            System.out.println(email);
        }
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(task);
        executorService.submit(email);

        executorService.shutdown();

        LOGGER.info("Emeliyyat bitdi.");
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        LOGGER.info("Emeliyyatın çəkdiyi müddət: " + duration + " millisaniyə");
    }
}



