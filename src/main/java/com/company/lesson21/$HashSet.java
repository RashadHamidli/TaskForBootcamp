package com.company.lesson21;

import java.util.HashSet;

public class $HashSet {
    public static void main(String[] args) {
        for (Object o : hashSetToArrays()){
            System.out.println(o);
        }
    }

    public static Object[] hashSetToArrays() {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(5);
        return hashSet.toArray();
    }

}
