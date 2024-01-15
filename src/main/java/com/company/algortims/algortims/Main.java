package com.company.algortims.algortims;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("bir");
        list.stream().forEach(System.out::println);
        String s = (String) list.get(0);
        System.out.println(s);

    }
}
