package com.app.bank;

public class DailyDemand extends Credit {
    public DailyDemand(int period, double summa) {
        this.setPeriod(period);
        this.setSumma(summa);
        if (getPromo() != null && getPromo().equals("promo")) {
            setFaiz(0.18);
        } else {
            System.out.println(getPromo());
            setFaiz(0.22);
        }
        setSortCredit("Gundelik krediti");
    }
}
