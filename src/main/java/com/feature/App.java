package com.feature;

public class App {

    public static void main(String[] args) {
        App app = new App();
        var b="negative";
        var positive = app.isPositive(-5);
        if (positive){
            b="positive";
        }
            System.out.println("this number is " + b);
    }

    public boolean isPositive(Integer number) {
        return number > 0;
    }

}
