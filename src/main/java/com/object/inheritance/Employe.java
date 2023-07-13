package com.object.inheritance;

public class Employe {
    private String name, surname, sector = "isci", employeInfo;
    private int vacation = 21;
    private double salary = 1500;

    public Employe(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String printInfo() {
        return employeInfo = "Ad, Soyad: " + name + " " + surname + "\nSector: " + sector +
                "\nMezuniyyet: " + vacation + "\nMaas: " + salary + "\n------------";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getEmployeInfo() {
        return employeInfo;
    }

    public void setEmployeInfo(String employeInfo) {
        this.employeInfo = employeInfo;
    }

    public int getVacation() {
        return vacation;
    }

    public void setVacation(int vacation) {
        this.vacation = vacation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
