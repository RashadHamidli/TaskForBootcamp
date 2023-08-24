package com.company.lesson23;

import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        averageStream();
    }

    public static void averageStream() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        OptionalDouble average = list.stream().mapToInt(Integer::intValue)
                .average();
        System.out.println(average);
    }

    public static void toLowerUpperCaseInStream() {
        List<String> list = Arrays.asList("Hello World");
        Stream<String> toLower = list.stream().map(String::toLowerCase);
        Stream<String> toUpper = list.stream().map(String::toUpperCase);
        toUpper.forEach(System.out::println);
        toLower.forEach(System.out::println);
    }

    public static void sumOddAndEvenNum() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Integer sumOddNum = list.stream().filter(a -> a % 2 == 0)
                .reduce(0, (a, b) -> a + b);
        System.out.println(sumOddNum);
        Integer sumEvenNum = list.stream().filter(a -> a % 2 != 0)
                .reduce(0, (a, b) -> a + b);
        System.out.println(sumEvenNum);
    }
    public static void removeDublicatElemByStream(){
        List<Integer> list = Arrays.asList(1, 2, 5, 3, 4, 2, 6, 9, 5, 3, 7, 8, 1, 4, 6);
        list.stream().distinct().forEach(System.out::println);
    }
    public static void minAndMaxSecondElemByStream(){
        List<Integer> list = Arrays.asList(2, 5, 6, 1, 8, 6, 4, 9, 2);
        Integer min = list.stream()
                .distinct()
                .sorted()
                .skip(1)
                .findFirst()
                .orElse(null);
        System.out.println("min second element: "+min);

        Integer max = list.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(null);
        System.out.println("max second element: "+max);
    }
}
