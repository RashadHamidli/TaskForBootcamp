package com.OOP.main;

import com.OOP.entity.Regtangle;

public class RegtangleMain {
    public static void main(String[] args) {
        Regtangle r = new Regtangle(5, 7);
        double area = r.getWidth() * r.getHeight();
        System.out.println("Regtangle are = " + area);
        double perimetr = r.getWidth() + r.getHeight();
        System.out.println("Regtangle perimetr = " + perimetr);
    }
}
