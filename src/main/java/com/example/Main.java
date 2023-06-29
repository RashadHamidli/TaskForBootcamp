package com.example;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        ededinTersiIleDuzunuYoxlamaq();
    }

    public static void ededinTersiIleDuzunuYoxlamaq() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("yoxlanilacaq ededi daxil edin: ");
        int eded = scanner.nextInt();
        int temp = eded;
        int ededinEksi = 0;
        while (temp != 0) {
            int sonReqem = temp % 10;
            ededinEksi = ededinEksi * 10 + sonReqem;
            temp /= 10;
        }
        System.out.print("ededin tersi ve duzu: ");
        if (eded == ededinEksi)
            System.out.println("eynidir");
        else
            System.out.println("ferqlidir");
    }

}
