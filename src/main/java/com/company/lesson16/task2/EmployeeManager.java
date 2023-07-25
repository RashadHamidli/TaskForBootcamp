package com.company.lesson16.task2;

public class EmployeeManager<MyType> {
    private final String companyName = "NHN Group";
    MyType salary;
    private String registerNumber;
    String name, surname;

    public String getRegisterNumber() {
        int i = name.length() / 2 + 1;
        int v = surname.length() / 2;
        this.registerNumber = companyName + ("-") + name.substring(i) + surname.substring(v);
        return registerNumber.toUpperCase();
    }

    @Override
    public String toString() {
        return  "companyName='" + companyName + '\'' +
                ", salary=" + salary +
                ", registerNumber='" + getRegisterNumber() + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname;
    }
}
