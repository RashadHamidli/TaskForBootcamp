package com.company.lesson22;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class Strm {
    public static void main(String[] args) throws Exception {

        List<Integer> list = Arrays.asList(1, 2, 8, 3, 6, 4, 6, 5, 4, 9, 5, 7, 8);
        Optional<Integer> sum = list.stream()
                .filter(x -> x % 2 == 0)
                .sorted()
                .distinct()
                .min((o1, o2) -> o1);
        System.out.println(sum);
    }
}
