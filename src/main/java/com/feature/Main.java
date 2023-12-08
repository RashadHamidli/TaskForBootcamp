package com.feature;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        var list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
        list.stream().forEach(System.out::println);
        System.out.println("---------------------------------------");
        list.parallelStream().forEach(System.out::println);

        var a = Arrays.asList(1, 2, 3);
        var b = Arrays.asList(4, 5, 6);
        var c = Arrays.asList(7, 8, 9);

        var l = List.of(a, b, c);
        l.stream().forEach(System.out::print);
//        l.stream().flatMap(i -> Arrays.stream(i)).forEach(System.out::println);
    }
}
