package com.company.lesson18.task2;


import java.util.LinkedList;

public class $LinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addLast("red");

        list.add(1, "black");

        list.addFirst("white");
        list.addLast("grey");

        String first = list.getFirst();
        System.out.println(first);
        String last = list.getLast();
        System.out.println(last);

        list.forEach(System.out::println);
        list.remove("red");
        list.removeFirst();
        list.removeLast();
        list.forEach(System.out::println);

    }
}
