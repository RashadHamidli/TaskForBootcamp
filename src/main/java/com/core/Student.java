package com.core;

public class Student {
    private Long id;
    private String name;
    private String surname;

    public Student(Long id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return String.format("| id: %d | name: %s | surname: %s |", id, name, surname);
    }
}
