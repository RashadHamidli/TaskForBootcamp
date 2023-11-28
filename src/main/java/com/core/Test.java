package com.core;

import java.sql.Time;

public class Test {
    public static void main(String[] args) {
        long beginTime = System.nanoTime();
        int i = 0;
        while (i < 1000000000) {
            i++;
        }
        System.out.println(i);
        long endTime = System.nanoTime();
        long time = endTime - beginTime;
        System.out.println("millisecond: " + time / 1000000.0);
    }
}
