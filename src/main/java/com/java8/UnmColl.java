package com.java8;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class UnmColl {
    public static void main(String[] args) {
        var a = "iki";
        int n = switch (a) {
            case "bir" -> 1;
            case "iki" -> 2;
            case "uc" -> 3;
            case "dord" -> 4;
            case "bes" -> 5;
            default -> 0;
        };
        System.out.println("switch: " + n);

        var month = LocalDate.now().getMonth();
        System.out.println(month);

        var integers = List.of(1, 2, 5, 4, 9, 36, 3, 4, 8, 20);
        integers.forEach(System.out::println);


        // toUnmodifiableList
        List<Integer> list = IntStream.range(1, 10)
                .boxed()
                .collect(Collectors.toUnmodifiableList());
        System.out.println(list);
        System.out.println(list.getClass().getName());

        // toUnmodifiableSet
        Set<Integer> set = IntStream.range(1, 10)
                .boxed()
                .collect(Collectors.toUnmodifiableSet());
        System.out.println(set);
        System.out.println(set.getClass().getTypeName());

        // toUnmodifiableMap
        Map<Integer, Double> map
                = IntStream.range(1, 10)
                .boxed()
                .collect(Collectors.toUnmodifiableMap(
                        i -> i,
                        i -> Math.pow(i, 3))
                );
        System.out.println(map);
        System.out.println(map.getClass().getTypeName());
    }
}
