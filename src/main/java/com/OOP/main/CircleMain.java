package com.OOP.main;

import com.OOP.entity.Circle;

public class CircleMain {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.setRadius(5);
        double area = Math.pow(c.getRadius(), 2) * Math.PI;
        System.out.println("Circle are = " + area);
        double circumference = 2 * c.getRadius() * Math.PI;
        System.out.println("Circle circumference =" + circumference);
    }
}
