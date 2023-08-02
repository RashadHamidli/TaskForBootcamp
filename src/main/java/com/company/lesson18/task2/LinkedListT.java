package com.company.lesson18.task2;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListT {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("a");
        list.addLast("z");
        list.add("b");
        list.add("c");
        list.add(3, "d");
        list.add(4, "e");


        list.forEach(System.out::println);
        long count = list.stream().count();
        System.out.println(count);
        int size = list.size();
        System.out.println(size);
//        list.remove(2);
//        list.remove("c");
//        list.forEach(System.out::println);
//        Collections.sort(list);
//        list.forEach(System.out::println);
//        list.removeFirst();
//        list.removeLast();
//        list.forEach(System.out::println);

    }
}
