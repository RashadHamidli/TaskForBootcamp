package com.company.lesson14.task4;

public class Main {
    public static void main(String[] args) {
        Animal wolf = new Wolf();
        System.out.println(wolf.makeSound());
        Animal snake = new Snake();
        System.out.println(snake.makeSound());
    }
}
