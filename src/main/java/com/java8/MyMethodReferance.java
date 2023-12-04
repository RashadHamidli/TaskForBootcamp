package com.java8;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class MyMethodReferance {
    public static void main(String[] args) {
        List<Object> list = Stream
                .builder()
                .add(new User(1, "Aaa", "Bbb"))
                .add(new User(2, "Ccc", "Ddd"))
                .build()
                .toList();
        list.forEach(System.out::println);

        Optional.of(new User(1, "a", "b"))
                .filter(user -> user.getName().equals("a"))
                .ifPresentOrElse(System.out::println, null);
    }
}
