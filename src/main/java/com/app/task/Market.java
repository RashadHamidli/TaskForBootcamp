package com.app.task;

public class Market extends ShopCalc {
    @Override
    double breadBuy(int howMuchBread) {
        return howMuchBread * 0.8;
    }
}
