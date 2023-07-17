package com.app.bank;

public class Credit {
    private String sortCredit, promo;
    private int period;
    private double summa, faiz, result;

    public Credit() {
    }


    public Credit(int period, double summa) {
        this.setPeriod(period);
        this.setSumma(summa);
//        this.getFaiz();
//        this.getSortCredit();
//        this.getResult();
//        this.getPromo();
    }

    public Credit(String sortCredit, int period, double summa, double faiz) {
        this.sortCredit = sortCredit;
        this.period = period;
        this.summa = summa;
        this.faiz = faiz;
    }

    public double resultSum() {
        return getSumma() + (getSumma() * (getFaiz() * (getPeriod() / 12)));
    }
    public double resultMonthlySum() {
        return resultSum()/period;
    }

    public String getPromo() {
        return promo;
    }

    public void setPromo(String promo) {
        this.promo = promo;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double umumiMebleg) {
        result = umumiMebleg;
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

    @Override
    public String toString() {
        return "Kreditin novu: " + sortCredit + "\nMuddet: " + period + "\nMebleg: " + summa +
                "\nFaiz: " + faiz * 100 + "%" + "\nUmumi odenecek mebleg: " + resultSum()+
                "\nAyliq odenilecek mebleg: "+resultMonthlySum();
    }
}
