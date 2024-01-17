package com.company.controller;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>(16, 0.8f, true);
        map.put("Ali", "bir");
        map.put("Mehemmed", "iki");
        map.put("Gunay", "uc");
        map.put("Xanim", "dord");
        map.put("Malik", "bes");
        map.put("Gulnare", "alti");
        map.put("Eziz", "yeddi");
        map.put("Vusal", "sekkiz");
        map.put("Pasa", "doqquz");

        System.out.println(map);

        String s = map.get("Xanim");
        System.out.println(s);
        System.out.println(map);

        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>(5, 0.75f, true);

        linkedHashMap.put(1, "Apple");
        linkedHashMap.put(2, "Banana");
        linkedHashMap.put(3, "Orange");

        System.out.println("Original LinkedHashMap: " + linkedHashMap);
// Output: Original LinkedHashMap: {1=Apple, 2=Banana, 3=Orange}

        linkedHashMap.get(2);  // Accessing key 2, moves it towards the end

        System.out.println("LinkedHashMap after access: " + linkedHashMap);
    }
}
