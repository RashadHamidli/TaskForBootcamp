package com.company.lesson21;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class $HashMap {
    public static void main(String[] args) {
        colectionsToHashMap();
    }
    public static void containsKeyToHashMap(){
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "a");
        hashMap.put(2, "b");
        hashMap.put(3, "c");
        hashMap.put(4, "d");
        hashMap.put(5, "e");
        boolean b = hashMap.containsKey(5);
        boolean b1 = hashMap.containsKey(8);
        System.out.println(b);
        System.out.println(b1);
    }
    public static void containsValueToHashMap(){
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "a");
        hashMap.put(2, "b");
        hashMap.put(3, "c");
        hashMap.put(4, "d");
        hashMap.put(5, "e");
        boolean b = hashMap.containsValue("c");
        boolean b1 = hashMap.containsValue("z");
        System.out.println(b);
        System.out.println(b1);
    }
   public static void getValueToHashMap(){
       HashMap<Integer, String> hashMap = new HashMap<>();
       hashMap.put(1, "a");
       hashMap.put(2, "b");
       hashMap.put(3, "c");
       hashMap.put(4, "d");
       hashMap.put(5, "e");
       String s=hashMap.get(5);
       System.out.println(s);
   }
    public static void getContainToHashMap(){
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "a");
        hashMap.put(2, "b");
        hashMap.put(3, "c");
        hashMap.put(4, "d");
        hashMap.put(5, "e");
        boolean b = hashMap.containsKey(3);
        boolean b1 = hashMap.containsValue("b");
        System.out.println(b);
        System.out.println(b1);
    }
    public static void colectionsToHashMap(){
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "a");
        hashMap.put(2, "b");
        hashMap.put(3, "c");
        hashMap.put(4, "d");
        hashMap.put(5, "e");
        Collection<String> c= hashMap.values();
        for(String s:c){
            System.out.println(s);
        }
    }

}
