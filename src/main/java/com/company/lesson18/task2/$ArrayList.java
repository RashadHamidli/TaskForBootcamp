package com.company.lesson18.task2;

import java.util.*;

public class $ArrayList {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("red");
        list.add("blue");
        list.add("green");
        list.add("black");
        list.add("yellow");
        list.forEach(System.out::println);
        System.out.println("------------------");

        Object clone = list.clone();
        System.out.println(clone);
        System.out.println("------------------");

        list.remove(3);
        list.forEach(System.out::println);
        System.out.println("------------------");

        String s = list.get(1);
        System.out.println(s);
        System.out.println("------------------");

        Collections.sort(list);
        list.forEach(System.out::println);
        System.out.println("------------------");

        Object[] array = list.toArray();
        for(Object obj: array){
            System.out.println(obj);
        }
        System.out.println("------------------");

    }
}

