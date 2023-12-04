package com.java8;

import java.time.LocalDate;

public class MyJava11 {

    public static void main(String[] args) {
        String hangiCeyrek = switch (LocalDate.now().getMonth()) {
            case JANUARY, FEBRUARY, MARCH:
                yield "İlk çeyrek";
            case APRIL, MAY, JUNE:
                yield "ikinci çeyrek";
            case JULY, AUGUST, SEPTEMBER:
                yield "üçüncü çeyrek";
            case OCTOBER, NOVEMBER, DECEMBER:
                yield "son çeyrek";
            default:
                yield "bilinmeyen çeyrek";
        };
        System.out.println(hangiCeyrek);

        String hangiCeyrek1 = switch (LocalDate.now().getMonth()) {
            case JANUARY, FEBRUARY, MARCH -> "İlk çeyrek";
            case APRIL, MAY, JUNE -> "ikinci çeyrek";
            case JULY, AUGUST, SEPTEMBER -> "üçüncü çeyrek";
            case OCTOBER, NOVEMBER, DECEMBER -> "son çeyrek";
            default -> "bilinmeyen çeyrek";
        };
        System.out.println(hangiCeyrek1);

        var st = " Salam";

        var ss = st.transform(s -> {
            var upperCase = s.toUpperCase();
            return upperCase.strip();
        });
        System.out.println(ss);
        var transform = st.strip().transform(OpClass::toUpperCase);
        System.out.println(transform);
    }

    static class OpClass {
        private static String toUpperCase(String s) {
            return s.toUpperCase();
        }
    }
}
