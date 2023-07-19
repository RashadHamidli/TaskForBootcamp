package com.example;

import java.util.Scanner;

public class NewTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1,num2;
        String emeliyyat;
        System.out.println("İki reqem ile dord emeliyyat\n----------\n1- Toplama emeliyyati (+)\n2- Cixma emeliyyati (-)\n3- Vurma emeliyyati (*)\n4- Bölme emeliyyati (/)\n----------");
        System.out.print("ilk ededi daxil edin: ");
        num1=scanner.nextDouble();
        System.out.print("ikinci emeliyyati daxil edin: ");
        num2=scanner.nextDouble();
        System.out.print("----------\nemeliyyat novu: ");
        emeliyyat=scanner.next();
        System.out.println("----------\nemeliyyat neticesi: "+ calculator(num1,num2,emeliyyat));
    }
    public static double calculator(double a, double b, String emeliyyat){
        if(emeliyyat.equals("+")||emeliyyat.equals("1")){
            return a+b;
        }
        else if(emeliyyat.equals("-")||emeliyyat.equals("2")){
            return a-b;
        }
        else if(emeliyyat.equals("*")|| emeliyyat.equals("3")){
            return a*b;
        }
        else if(emeliyyat.equals("/")|| emeliyyat.equals("4")){
            return a/b;
        }
        else{
            return 0;
        }
    }
}
