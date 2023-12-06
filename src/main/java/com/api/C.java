package com.api;

public sealed class C implements A permits D  {
    @Override
    public void print() {
        System.out.println("C");
    }
}
