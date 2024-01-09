package com.company.algortims.algortims;

import java.util.Objects;

public class B {
    private String name;
    private String surname;
    private int age;
    private double salary;

    public static void main(String[] args) {
        B b = new B();
        B bb = new B();
        System.out.println(b);
        System.out.println(bb);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        B b = (B) o;
        return age == b.age && Double.compare(salary, b.salary) == 0 && Objects.equals(name, b.name) && Objects.equals(surname, b.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, salary);
    }
}
