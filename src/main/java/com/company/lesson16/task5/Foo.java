package com.company.lesson16.task5;

import java.util.ArrayList;

public class Foo {
    public static void main(String[] args) {
        ArrayList<String> regions = new ArrayList<>();
        regions.add("Quba");
        regions.add("Oğuz");
        regions.add("Qəbələ");
        regions.add("Xaçmaz");
        regions.add("Ağsu");
        regions.add("Oğuz");
        regions.add(3, "Qusar");
        regions.add(3, "Gusar");
        Object clone = regions.clone();
        System.out.println(clone);
        regions.add(0, "Baki");
        boolean b = regions.contains("Baki");
        System.out.println(b);
        regions.forEach(System.out::println);
//        regions.forEach(region -> System.out.print(region + ", "));
    }
}
