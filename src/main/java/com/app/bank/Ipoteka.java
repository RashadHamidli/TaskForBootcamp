package com.app.bank;

public class Ipoteka extends Credit {

    public Ipoteka(int period, double summa) {
        this.setPeriod(period);
        this.setSumma(summa);
        setFaiz(0.08);
        setSortCredit("Ipoteka");
    }
}
