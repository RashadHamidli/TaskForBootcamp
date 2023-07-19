package com.app.task;

public class SuperMarket extends ShopCalc {
    @Override
    double breadBuy(int howMuchBread) {
        return howMuchBread * 0.75;
    }
}
