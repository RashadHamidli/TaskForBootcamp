package com.core;

public class LoopControl {
    public static void main(String[] args) {
        Student[] students = {new Student(1L, "aa", "aa"),
                new Student(2L, "bb", "bb")};

        for (Student s : students) {
            System.out.println(s);
        }
    }
}
