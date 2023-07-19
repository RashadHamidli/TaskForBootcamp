package com.app.task;

import java.util.Scanner;

public class CustManager {
    ShopCalc shopCalc;
    Scanner scanner = new Scanner(System.in);
    void doTheShopping(){
        System.out.print("-> Nece eded corek alacaqsiniz: ");
        int x = scanner.nextInt();
        System.out.println("-> corek qiymeti: "+ shopCalc.breadBuy(x)/x+" AZN");
        System.out.println("-> Almış Olduğunuz "+ x +" corek ucun odemeli oldugunuz mebleg: "+ shopCalc.breadBuy(x)+" AZN");
        System.out.println("-------------------");
    }
}
