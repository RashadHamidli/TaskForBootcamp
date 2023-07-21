package com.company.lesson11.task2;

public class Kvadrat extends FiqurunHecmi{

    public Kvadrat(double en, double uzunluq) {
        super(en, uzunluq);
    }

    @Override
    public void fiqurunSahesi() {
        double sahe = uzunluq * en;
        System.out.println("kvasratin sahesi: " + sahe);
    }
}
