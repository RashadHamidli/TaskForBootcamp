package com.company.lesson22;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Strm {
    public static void main(String[] args) throws MyException {

        Optional<String> opt = Optional.ofNullable(null);
//        String a = opt.get();
//        String s=opt.orElse("deyer yoxdur orElse");
//        String s1 = opt.orElseGet(() -> "deyer yoxdur orElseGet");
        String s2=opt.orElseThrow(MyException::new);
        System.out.println(s2);


    }

}
