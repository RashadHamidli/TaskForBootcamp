package com.company;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Controller {

    public void addTask() {
        Task task = null;
        for (int i = 0; i < 1000000; i++) {
            task = new Task("a", "aa");
            System.out.println(task);
        }
        Thread thread = new Thread(task);
        thread.start();
    }

    public void sendEmail() {
        Email email = null;
        for (int i = 0; i < 1000000; i++) {
            email = new Email("b", "bb");
            System.out.println(email);
        }        Thread thread = new Thread(email);
        thread.start();
    }

    public void addTaskAndSendEmail() {
        sendEmail();
        addTask();
    }

    public void addTaskAndSendEmailSimple() {
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
    }
    public void addTaskAndSendEmailExecutors() {
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
    }


    public void addTaskAndSendEmailEx() {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(this::addTaskExecutors);
        executorService.submit(this::sendEmailExecutors);
        executorService.shutdown();
    }

    public void addTaskExecutors() {
        Task task = new Task("mytask", "bu menim yeni taskimdir");
        System.out.println("task yaradildi " + Thread.currentThread().getName());
    }

    public void sendEmailExecutors() {
        Email email = new Email("rashad@gmai.com", "siz yeni task elave etdiniz");
        System.out.println("email gonderildi " + Thread.currentThread().getName());
    }

}
