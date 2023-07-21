package com.company.lesson11.task2;

public class Duzbucaqli extends FiqurunHecmi {
    public Duzbucaqli(double en, double uzunluq) {
        super(en, uzunluq);
    }

    @Override
    public void fiqurunSahesi() {
        double sahe = uzunluq * en;
        System.out.println("duzbucaqlinin sahesi: " + sahe);
    }
}
