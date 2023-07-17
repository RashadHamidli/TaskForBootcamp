package com.app.bank;

public class Ipoteka extends Credit {

    public Ipoteka(int period, double summa) {
        this.setPeriod(period);
        this.setSumma(summa);
        if (getPromo() != null && getPromo().equals("promo")) {
            setFaiz(0.06);
        } else {
            System.out.println(getPromo());
            setFaiz(0.08);
        }
        setSortCredit("Ipoteka");
    }
}
