package com.company.lesson18.task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("d");
        list.add(2, "c");
        list.add(4, "e");

        list.forEach(System.out::println);
        long l = list.stream().count();
        System.out.println(l);

        list.remove(2);
        System.out.println("-------------------");

        list.forEach(System.out::println);

        long count = list.stream().count();
        System.out.println(count);

        list.clear();
        list.forEach(a -> System.out.println("cleardan sonra massiv"+a));


    }
}
