package com.feature;

public interface Feature {
    static void main(String[] args) {
        Feature feature = new Feature() {
            @Override
            public void a() {
                System.out.println("print method a");
            }

            @Override
            public void b(int a, int b) {
                System.out.println("print a+b=" + a + b);
            }
        };
        feature.a();
        feature.b(3,5);

    }

    void a();

    void b(int a, int b);
}
