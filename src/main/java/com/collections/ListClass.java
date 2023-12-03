package com.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListClass {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(3);
        System.out.println(list);
        list.add(1,9);
        System.out.println(list);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(2);
        list1.add(2);
        list.addAll(list1);
        System.out.println(list);

        System.out.println(list.get(5));
        int i1 = list.indexOf(2);
        int i = list.lastIndexOf(2);
        System.out.println(i);
        System.out.println(i1);


        ListIterator<Integer> integerListIterator = list.listIterator();
        while (integerListIterator.hasNext()){
            Integer next = integerListIterator.next();
            System.out.printf("%d, ",next);
            System.out.println();
        }

        java.util.List<Integer> integers = list.subList(2, 5);
        System.out.println(integers);


    }

}
