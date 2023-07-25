package com.company.lesson16.task3;

public class Box<T> {
    private T t;
    public T getT() {
        return t;
    }
    public void setT(T t) {
        this.t = t;
    }
    public static void main(String[] args) {
        Box<String> s = new Box<>();
        s.setT("Hello World");
        System.out.println("String type: " + s.getT());
        Box<Integer> i = new Box<>();
        i.setT(10);
        System.out.println("Integer type: " + i.getT());
    }

}
