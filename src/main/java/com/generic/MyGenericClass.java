package com.generic;

public class MyGenericClass<T> {
    private T t;

    public MyGenericClass() {
    }

    public MyGenericClass(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return String.format("%s, %s", t.getClass(),t);
    }
}
