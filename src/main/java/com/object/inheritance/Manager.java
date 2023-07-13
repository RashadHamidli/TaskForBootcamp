package com.object.inheritance;

public class Manager extends Employe {
        public Manager(String name, String surname) {
        super(name, surname);
        setSector("Manager");
        setSalary(3000);
        setVacation(30);
    }
}
