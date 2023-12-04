package com.java8;

import com.sun.source.doctree.SeeTree;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MyStream {
    public static void main(String[] args) {
        Stream
                .of("Black", "Red", "White", "Green", "Yellow", "Blue")
                .map(s -> s.startsWith("B")||s.startsWith("b"))
                .forEach(System.out::println);
    }
}
