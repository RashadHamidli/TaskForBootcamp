package com.company.lesson;

import java.util.ArrayList;
import java.util.List;

public class task1 {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("black");
        list.add("yellow");
        list.add("greeen");
        list.forEach(System.out::println);

    }
}
