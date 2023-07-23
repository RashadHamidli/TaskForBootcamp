package com.app.pet;

public class Woman extends Human {
    public Woman(String name, String surname, int age) {
        super(name, surname, age);
    }

    public String makeUp() {
        return "woman is doing makeup";
    }
}
