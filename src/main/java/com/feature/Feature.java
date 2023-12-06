package com.feature;

public interface Feature {
    static void main(String[] args) {
//        Feature feature=()-> System.out.println("salam");
//        feature.a();

        Feature feature =(a, b)-> System.out.println(a+b);
//        feature.b(3,5);
    }

//    void a();

    void b(int a, int b);
}
