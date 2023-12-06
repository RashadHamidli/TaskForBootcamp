package com.feature;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        Employee employee1 = new Employee("a", 300d);
        Employee employee2 = new Employee("b", 800d);
        Employee employee3 = new Employee("c", 700d);
        Employee employee4 = new Employee("d", 400d);
        Employee employee5 = new Employee("e", 500d);
        Employee employee6 = new Employee("f", 900d);
        Stream
                .of(employee1, employee2, employee3, employee4, employee5, employee6)
                .sorted(Comparator.comparingDouble(Employee::salary).reversed())
                .limit(3)
                .map(Employee::name)
                .forEach(System.out::println);
    }
}
