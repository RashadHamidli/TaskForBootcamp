package com.app.bank;

public class Credit {
    private String sortCredit;
    private int period;
    private double summa, faiz;

    public Credit() {
    }

    public Credit(String sortCredit, int period, double summa, double faiz) {
        this.sortCredit = sortCredit;
        this.period = period;
        this.summa = summa;
        this.faiz = faiz;
    }

    public String getSortCredit() {
        return sortCredit;
    }

    public void setSortCredit(String sortCredit) {
        this.sortCredit = sortCredit;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public double getSumma() {
        return summa;
    }

    public void setSumma(double summa) {
        this.summa = summa;
    }

    public double getFaiz() {
        return faiz;
    }

    public void setFaiz(double faiz) {
        this.faiz = faiz;
    }
}
