package com.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task2 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        String date=DateTimeFormatter.ofPattern("dd/MM/yyyy").format(localDate);
        System.out.println(date);
    }
}
