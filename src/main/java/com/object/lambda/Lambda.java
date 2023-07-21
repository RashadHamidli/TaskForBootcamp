package com.object.lambda;

public class Lambda {
    public static void main(String[] args) {
        String a="Salam";
        Runnable runnable = () -> a.toUpperCase();
        System.out.println(runnable);
    }
}
