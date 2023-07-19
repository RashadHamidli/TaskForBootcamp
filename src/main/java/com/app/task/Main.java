package com.app.task;

public class Main {
    public static void main(String[] args) {
        CustManager custManager = new CustManager();
        custManager.shopCalc = new SuperMarket();
//        CustManager.shopCalc = new Market();
        custManager.doTheShopping();
    }
}
