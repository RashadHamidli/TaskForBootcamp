package com.company.lesson22;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Strm {
    public static void main(String[] args) throws Exception {

        Optional<String> opt = Optional.empty();
        String s = opt.orElse("deyer nulldur");
        System.out.println(s);


    }


}
