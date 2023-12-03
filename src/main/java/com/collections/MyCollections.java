package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyCollections {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(23);
        list.add(14);
        list.add(75);
        list.add(63);
        list.add(12);
        list.add(36);

        Collections.reverse(list);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.swap(list, 2, 4);
        System.out.println(list);

        Integer min = Collections.min(list);
        System.out.println(min);
    }
}
