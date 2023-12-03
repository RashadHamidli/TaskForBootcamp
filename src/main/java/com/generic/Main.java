package com.generic;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {


        MyGenericClass<Integer> i=new MyGenericClass<>(13);
        MyGenericClass<String> s=new MyGenericClass<>("salam");
    }
}
