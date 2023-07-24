package com.object.lambda;

public class Main {
    public static void main(String[] args) {
//        Audible audible = () -> System.out.println("Dog is barking");
//        audible.makeNoise();

        Sum sum = Integer::sum;

        Car car = ((start, stop) -> start + " herekete basladi " + stop + " dayandi");
        System.out.println(car.run("BMW", "sonra"));


    }
}
