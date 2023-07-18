package com.app.happyFamily;

public class Child extends Human {
    public Child(String name, String surname, int year, int iq) {
        super(name, surname, year, iq);
    }

    @Override
    public String toString() {
        return "name: " + getName() + ", surname: " + getSurname() + ", year: " + getYear() + ", iq: " + getIq();
    }
}
