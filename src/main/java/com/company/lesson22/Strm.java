package com.company.lesson22;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Strm {
    public static void main(String[] args) {

        String nullableValue = "deyer var";
        Optional<String> optionalNullableValue = Optional.ofNullable(nullableValue);
        String s = optionalNullableValue.orElse("deyer yoxdur");
        System.out.println(s);


    }

}
