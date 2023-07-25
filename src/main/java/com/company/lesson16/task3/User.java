package com.company.lesson16.task3;

// Generic "Çift" sınıfı
class User<T, U> {
    private T firstPerson;
    private U secondPerson;

    public User(T firstPerson, U secondPerson) {
        this.firstPerson = firstPerson;
        this.secondPerson = secondPerson;
    }

    public T getFirstPerson() {
        return firstPerson;
    }

    public U getSecondPerson() {
        return secondPerson;
    }
}



