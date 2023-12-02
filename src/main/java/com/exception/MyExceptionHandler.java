package com.exception;

public class MyExceptionHandler extends Exception {
    private double sum;

    public MyExceptionHandler(double sum) {
        this.sum = sum;
    }

    public double getSum() {
        return sum;
    }
}


