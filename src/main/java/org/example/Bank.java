package org.example;

public class Bank {
    private double billance=0;
    public double getBillance() {
        return billance;
    }

    public void setBillance(double billance) {
        this.billance = billance;
    }



    public double   wplata(double kwota){

        return billance = billance + kwota;
    }
    public double wyplata(double kwota){

        return billance = billance - kwota;

    }


}
