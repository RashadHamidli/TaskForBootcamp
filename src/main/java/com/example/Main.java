package com.example;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        stringinTersiIleDuzunuYoxlamaq();
    }

    public static void stringinTersiIleDuzunuYoxlamaq() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("sozu daxil edin: ");
        String soz = scanner.nextLine();//salam
        String tersSoz = "";
        for (int i = soz.length() - 1; i >= 0; i--) {
            tersSoz += soz.charAt(i);
        }
        if (soz.equals(tersSoz))
            System.out.println("sozun tersi ile duzu beraberdir! ");
        else
            System.out.println("sozun tersi ile duzu beraber deyil! ");
    }

}
