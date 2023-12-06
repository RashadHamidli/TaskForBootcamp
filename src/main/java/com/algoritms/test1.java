package com.algoritms;

public class test1 {
    public static void main(String[] args) {
        int a=35, b=15;
        System.out.println(ebob(a,b));

    }
    public static int ebob(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return ebob(b, a % b);
        }
    }
}
