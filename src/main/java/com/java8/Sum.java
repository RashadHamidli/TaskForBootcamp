package com.java8;

import java.util.function.DoublePredicate;
import java.util.stream.DoubleStream;

interface MySum {
    default double addEvenNumbers(double... nums) {
        return add(n -> n % 2 == 0, nums);
    }

    default double addOddNumbers(double... nums) {
        return add(n -> n % 2 != 0, nums);
    }

    private double add(DoublePredicate doublePredicate, double... nums) {
        return DoubleStream
                .of(nums)
                .filter(doublePredicate)
                .sum();
    }
}

public class Sum implements MySum {
    public static void main(String[] args) {
        Sum sum = new Sum();
        sum.addEvenNumbers(5, 3, 2, 4, 5, 6, 89, 5, 1456, 15, 8, 32, 0);
    }
}
