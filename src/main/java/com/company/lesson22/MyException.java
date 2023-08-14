package com.company.lesson22;

public class MyException extends Exception {
    public MyException() {
        fff("xeta bas verdi");
    }
    public static void fff(String s){
        System.out.println(s);
    }
}
