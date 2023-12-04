package com.java8;

public class Main {
    public static void main(String[] args) {
        Student student=new Student(1L, "A", "B");
        var string = student.toString();
        System.out.println(string);
    }
}
