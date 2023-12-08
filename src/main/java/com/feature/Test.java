package com.feature;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        Employee employee1 = new Employee("a", 300d, true);
        Employee employee2 = new Employee("b", 800d, true);
        Employee employee3 = new Employee("c", 700d, true);
        Employee employee4 = new Employee("d", 400d, false);
        Employee employee5 = new Employee("e", 500d, true);
        Employee employee6 = new Employee("f", 900d, false);
        Stream
                .of(employee1, employee2, employee3, employee4, employee5, employee6)
                .sorted(Comparator.comparingDouble(Employee::salary).reversed())
                .filter(Test::isActive)
                .limit(3)
                .map(Employee::name)
                .forEach(System.out::println);

        String a = Stream
                .of(employee1, employee2, employee3, employee4, employee5, employee6)
                .map(Employee::name)
                .collect(Collectors.joining("a"));
        System.out.println(a);

        Stream
                .of(employee1, employee2, employee3, employee4, employee5, employee6)
                .filter(Test::isActive)
                .reduce((r1, r2) -> r1.salary() > r2.salary() ? r1 : r2)
                .ifPresent(System.out::println);
    }

    private static boolean isActive(Employee employee) {
        return employee.isActive();
    }
}
