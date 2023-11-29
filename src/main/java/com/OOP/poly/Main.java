package com.OOP.poly;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("c");
        list.add("d");
        list.add("b");
        Collections.sort(list);
        for (String l : list) {
            System.out.println(l);
        }
        System.out.println("---------------------");
        list.forEach(System.out::println);
        System.out.println("---------------------");
        Stream<String> sortedList = list.stream().sorted();
        sortedList.forEach(System.out::println);
    }
}
