package com.company.lesson16.task3;

public class Max {
    public static void main(String[] args) {
        Integer max = max(3, 4, 5);
        System.out.println(max);
        Double maxD = max(3.5, 4.5, 5.6);
        System.out.println(maxD);
        String s = maxString("a", "v", "r");
        System.out.println(s);
    }

    public static <T extends Number> T max(T x, T y, T z) {
        T max = x;
        if (y.intValue() > x.intValue()) {
            max = y;
        }
        if (z.intValue() > y.intValue()) {
            max = z;
        }
        return max;
    }
    public static <E extends String> E maxString(E x, E y, E z){
        E max=x;
        if(y.compareTo(x)>0){
            max=y;
        }
        if(z.compareTo(y)>0){
            max=z;
        }
        return max;
    }
}
