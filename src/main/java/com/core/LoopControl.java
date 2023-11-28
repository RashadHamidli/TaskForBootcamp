package com.core;

import java.util.Arrays;
import java.util.List;

public class LoopControl {
    public static void main(String[] args) {
        Student[] students = {new Student(1L, "aa", "aa"),
                new Student(2L, "bb", "bb")};

        List<String> list = Arrays.stream(students).map(Student::toString).toList();
        System.out.println(list);

        for (Student s : students) {
            System.out.println(s);
        }
    }
}
