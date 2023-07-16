package com.app.bank;

public class DailyDemand extends Credit{
    public DailyDemand(int period, double summa){
        this.setPeriod(period);
        this.setSumma(summa);
        setFaiz(0.22);
        setSortCredit("Gundelik krediti");
    }
}
