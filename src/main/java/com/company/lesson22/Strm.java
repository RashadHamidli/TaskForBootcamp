package com.company.lesson22;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Strm {
    public static void main(String[] args) {

        List<Integer> list = List.of(1, 3, 5, 4, 8, 6, 7, 9, 2, 4, 6, 8, 1, 2, 3);
        Integer reduce = list.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println(reduce);
       

    }
}
