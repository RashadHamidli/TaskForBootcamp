package com.object.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("soz1", "soz2", "soz3");
        words.forEach(System.out::println);

        List<Integer> num = new ArrayList<>();
        num.add(14);
        num.add(36);
        num.add(21);
        num.forEach(s-> System.out.println(s));
        num.forEach(System.out::println);
    }
}
