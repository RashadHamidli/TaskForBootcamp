package com.company;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPoolExample {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);

        for (int i = 0; i < 5; i++) {
            Runnable task = new MyTask("Task " + (i + 1));
            System.out.println("yeni task evave olundu: " + task);
            executor.execute(task);
        }

        executor.shutdown();
    }
}

class MyTask implements Runnable {
    private String name;

    public MyTask(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " isleyir: " + Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " tamamlandi.");
    }
}

