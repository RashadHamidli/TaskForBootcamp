package com.company;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Controller implements Runnable{

    public void addTask() {
        Task task = new Task("mytask", "bu menim yeni taskimdir");
        Thread thread = new Thread(task);
        thread.start();
    }

    public void sendEmail() {
        Email email = new Email("rashad@gmai.com", "siz yeni task elave etdiniz");
        Thread thread = new Thread(email);
        thread.start();
    }

    public void addTaskAndSendEmail() {
        sendEmail();
        addTask();
    }

    public void addTaskAndSendEmailExecutors() {
        Task task = new Task("a", "aa");
        Email email = new Email("b", "bb");

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(task);
        executorService.submit(email);

        executorService.shutdown();
    }
    public void addTaskAndSendEmailEx() {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(()->run());
        executorService.shutdown();
    }

    public void addTaskExecutors() {
        Task task = new Task("mytask", "bu menim yeni taskimdir");
        System.out.println("task yaradildi");
    }

    public void sendEmailExecutors() {
        Email email = new Email("rashad@gmai.com", "siz yeni task elave etdiniz");
        System.out.println("email gonderildi");
    }

    @Override
    public void run() {
        System.out.println("basladi 2 san gozleyecek");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        addTaskExecutors();
        System.out.println("task bitdi "+Thread.currentThread().getName());
        System.out.println("elave 2 san gozleyecek");

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        sendEmailExecutors();
        System.out.println("email gonderdi "+ Thread.currentThread().getName());
    }
}
