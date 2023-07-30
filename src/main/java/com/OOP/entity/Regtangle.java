package com.OOP.entity;

public class Regtangle {
    private double width;
    private double height;

    public Regtangle() {
    }

    public Regtangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double area(double width, double height) {
        double area = width * height;
        System.out.println("Regtangle are = " + area);
        return area;

    }

    public double perimetr(double width, double height) {
        double perimetr = 2*(width + height);
        System.out.println("Regtangle perimetr = " + perimetr);
        return perimetr;
    }
}
