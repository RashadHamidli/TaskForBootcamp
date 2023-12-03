package com.generic;

public class Main {
    public static void main(String[] args) {
        MyGenericClass<Integer> i=new MyGenericClass<>(13);
        MyGenericClass<String> s=new MyGenericClass<>("salam");

        MyGenericMethod m=new MyGenericMethod();
        System.out.println(m.get(i));
        System.out.println(m.get(s));
    }
}
