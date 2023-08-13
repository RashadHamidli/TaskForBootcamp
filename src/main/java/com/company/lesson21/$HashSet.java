package com.company.lesson21;

import java.util.HashSet;

public class $HashSet {
    public static void main(String[] args) {

        for (Object o : hashSetToArrays()) {
            System.out.println(o);
        }

        System.out.println("----------------\nHashSetdeki elementlerin sayi: " + countElemToHashSet());

        System.out.println("----------------\nHashSetin dolu ve ya bos olmasi: " + isEmptyHashSet());

        System.out.println("----------------");
        retainElemHashSet();

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

    public static int countElemToHashSet() {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(5);
        return hashSet.size();
    }

    public static void retainElemHashSet() {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
        System.out.println("1ci massivin elementleri: ");
        hashSet.forEach(System.out::println);

        HashSet<Integer> hashSet1 = new HashSet<>();
        hashSet1.add(3);
        hashSet1.add(4);
        hashSet1.add(5);
        System.out.println("ikinci massivin elementleri: ");
        hashSet1.forEach(System.out::println);

        hashSet.retainAll(hashSet1);
        System.out.println("elementlerin kesismesi");
        hashSet.forEach(System.out::println);
    }

    public static boolean isEmptyHashSet() {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(5);
        return hashSet.isEmpty();
    }

}
