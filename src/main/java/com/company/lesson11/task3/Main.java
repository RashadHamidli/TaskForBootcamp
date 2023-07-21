package com.company.lesson11.task3;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Rashad");
        person.setNationality("Azerbaijani");
        person.setAge(29);
        System.out.println("Name: " + person.getName() + "\nNationality: " + person.getNationality() + "\nAge: " + person.getAge());

    }
}
