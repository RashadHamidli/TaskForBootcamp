package com.company.lesson18.task2;

import java.util.List;

public class ArrayListT {
    public static void main(String[] args) {
        List<String> list = new java.util.ArrayList<>(10);
        list.add("a");
        list.add("b");
        list.add("d");
        list.add(2, "c");
        list.add(4, "e");
        list.add("c");
        list.add(9,"J");

        list.forEach(System.out::println);
        Object[] array = list.toArray();
        for (Object o : array) {
            System.out.println(o);
        }
        int i = list.lastIndexOf("c");
        System.out.println(i);
//        long count = list.stream().count();
//        System.out.println("count: " + count);
//        list.remove(3);
//        int size = list.size();
//        System.out.println("size: " + size);
//
//        boolean b = list.contains("a");
//        System.out.println(b);
//        String s = list.get(3);
//        System.out.println(s);
//        Collections.sort(list);
//        list.forEach(System.out::println);
    }
}
