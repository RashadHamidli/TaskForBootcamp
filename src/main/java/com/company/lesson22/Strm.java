package com.company.lesson22;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Strm {
    public static void main(String[] args) {

        Stream<Integer> i = Stream.of(1, 2, 3, 4, 5)
                .map(m -> m * 2)
                .distinct()
                .filter(f -> f.equals(2));
        i.forEach(System.out::println);
        Consumer consumer;
        Predicate predicate;
        Function function;
        Supplier supplier;


    }

}
