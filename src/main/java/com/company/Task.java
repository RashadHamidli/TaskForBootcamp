package com.company;

import java.util.concurrent.ForkJoinTask;

public class Task implements Runnable{
    private String name;
    private String description;

    public Task(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void run() {
//        System.out.println("task add etmek 3 saniye sonra bitecek\n "+Thread.currentThread().getName()+" ise basladi");
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println("task add edildi\n"+Thread.currentThread().getName()+" isini bitirdi");
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
