package com.java8;

import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class ImmCollections {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 5, 6, 47, 9, 2, 58, 32, 5, 52);
        list.forEach(System.out::println);

        Map<Integer, Character> map = Map.of(1, 'a', 2, 'b', 3, 'c', 4, 'd', 5, 'e');

        map.forEach((integer, character) -> System.out.println("key=" + integer + " value=" + character));
    }
}
