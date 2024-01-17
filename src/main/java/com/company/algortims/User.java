package com.company.algortims;

import java.util.Comparator;

public class User implements Comparable<User> {
    private int age;
    private String name, surname;

    public User(int age, String name, String surname) {
        this.age = age;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    @Override
    public int compareTo(User o) {
        return Integer.compare(this.age, o.age);
    }
}
