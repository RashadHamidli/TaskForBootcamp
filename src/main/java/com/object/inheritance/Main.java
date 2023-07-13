package com.object.inheritance;

public class Main {
    public static void main(String[] args) {
        Employe employe = new Employe("Rashad", "Hamidli");
        System.out.println(employe.printInfo());

        employe.setName("Memmed");
        employe.setSurname("Memmedov");
        System.out.println(employe.printInfo());

        Manager manager = new Manager("Eli", "Eliyev");
        System.out.println(manager.printInfo());

    }
}
