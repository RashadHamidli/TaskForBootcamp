package com.OOP.entity;

public class Circle {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea(double radius){
        double area = Math.pow(radius, 2) * Math.PI;
        System.out.println("Circle are = " + area);
        return area;
    }
    public double calculateCircumference(double radius){
        double circumference = 2 * radius * Math.PI;
        System.out.println("Circle circumference =" + circumference);
        return circumference;
    }
}
