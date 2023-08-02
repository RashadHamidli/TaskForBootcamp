package com.company.lesson18.task2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("d");
        list.add(2, "c");
        list.add(4, "e");
        list.add("c");

        list.forEach(System.out::println);
        long count = list.stream().count();
        System.out.println("count: " + count);
        list.remove(3);
        int size = list.size();
        System.out.println("size: " + size);

        boolean b = list.contains("a");
        System.out.println(b);
        String s = list.get(3);
        System.out.println(s);
        Collections.sort(list);
        list.forEach(System.out::println);

    }
}
