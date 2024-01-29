package com.company;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

public class MyParallelProgram {
    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = new ForkJoinPool();

        // İlk görevi Fork-Join Pool'a gönder
        forkJoinPool.submit(() -> {
            for (int i = 0; i < 1000000; i++) {
                Email email = new Email("b", "bb");
                    System.out.println(email);
            }
        });

        // İkinci görevi Fork-Join Pool'a gönder
        forkJoinPool.submit(() -> {
            for (int i = 0; i < 1000000; i++) {
                Task task = new Task("b", "bb");
                    System.out.println(task);
            }
        });

        // Fork-Join Pool'u kapat
        forkJoinPool.shutdown();
        try {
            // Tüm görevlerin tamamlanmasını bekleyin
            forkJoinPool.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
