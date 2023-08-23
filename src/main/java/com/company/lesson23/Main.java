package com.company.lesson23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        list.stream().filter(a->a%2==0);
    }
    public static void averageStream(){
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Integer reduce = list.stream().reduce(0, (a, b) -> a + b);
        int size = list.size();
        int avr = reduce / size;
        System.out.println(avr);
    }
    public static void toLowerUpperCaseInStream(){
        List<String> list = Arrays.asList("Hello World");
        Stream<String> toLower = list.stream().map(String::toLowerCase);
        Stream<String> toUpper = list.stream().map(String::toUpperCase);
        toUpper.forEach(System.out::println);
        toLower.forEach(System.out::println);
    }
}
