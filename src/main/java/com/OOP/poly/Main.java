package com.OOP.poly;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("E, dd.MM.yyyy HH:mm:ss");
        String format = dateTimeFormatter.format(localDateTime);
        System.out.println(format);

    }
}
