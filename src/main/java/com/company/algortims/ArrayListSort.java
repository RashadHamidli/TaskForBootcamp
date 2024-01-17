package com.company.algortims;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSort {
    public static void main(String[] args) {
        List<User> list = new ArrayList<>();
        list.add(new User(25, "Ali", "Aliyev"));
        list.add(new User(28, "Vali", "Memmedov"));
        list.add(new User(32, "Memmed", "Aliyev"));
        list.add(new User(35, "Ehmed", "Ehmedzade"));
        list.add(new User(30, "Malik", "Musayev"));

        list.forEach(System.out::println);

        Collections.sort(list);

        list.forEach(System.out::println);
    }
}
