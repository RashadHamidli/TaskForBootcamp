package com.java8;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Student {
    public static void main(String[] args) {

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
