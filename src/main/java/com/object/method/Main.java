package com.object.method;

public class Main {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();

        userManager.setUserName("Rashad");
        userManager.setUserSurname("Hamidli");
        userManager.setDateOfBirthday(1994);
        System.out.println("Istifadeci Melumatlari\n-----------\nAdiniz: " + userManager.getUserName() +
                "\nSoyadiniz: " + userManager.getUserSurname() + "\nYasiniz: " + userManager.writeAge() + "\n-----------");
    }
}

