package com.feature;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        var a = Arrays.asList(1, 2, 3);
        var b = Arrays.asList(4, 5, 6);
        var c = Arrays.asList(7, 8, 9);

        Stream.of(a, b, c).flatMap(List::stream).forEach(s -> System.out.print(s + ", "));
    }
}
