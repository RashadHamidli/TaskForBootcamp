package com.company.lesson22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Strm {
    public static void main(String[] args) {


//        List<String> list = Arrays.asList("Baku", "Ganca", "Quba", "Qakh", "Lacin");
//        List<String> l = list.stream().map(s -> s.toUpperCase()).toList();
//        Stream<String> s = list.stream().map(String::toUpperCase);
//        s.forEach(System.out::println);
//        s.close();
//        Stream<String> a = list.stream().map(String::toLowerCase);
//        a.forEach(System.out::println);

    }

    public static void lowerCase(String s){
        String upperCase = s.toUpperCase();
        System.out.println(upperCase);
    }
}
