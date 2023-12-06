package com.api;

public sealed interface A permits B, C {
    public void print() ;
}
