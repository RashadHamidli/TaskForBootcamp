package com.java8;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class MyDate {
    public static void main(String[] args) {
        String pattern="dd-MM-yyy HH:mm:ss";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(pattern);
        LocalDateTime now = LocalDateTime.now();
        String date = now.format(dateTimeFormatter);
        System.out.println(date);

//        System.out.println(LocalDate.now());
//        System.out.println(LocalTime.now());
//        System.out.println(LocalDateTime.now());
//        ZoneId
//                .getAvailableZoneIds()
//                .forEach(System.out::println);
//        System.out.println(ZonedDateTime.now(ZoneId.of("Asia/Baku")));
//        System.out.println(ZonedDateTime.now());
//        System.out.println(OffsetTime.now());
//        System.out.println(OffsetDateTime.now());
    }
}
