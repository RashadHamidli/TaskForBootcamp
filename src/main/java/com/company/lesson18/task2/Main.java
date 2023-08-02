package com.company.lesson18.task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("baki");
        list.forEach(a-> System.out.println("ilk cap "+a));
        list.remove(2);
        list.forEach(a-> System.out.println("ikinci cap "+a));


    }
}
