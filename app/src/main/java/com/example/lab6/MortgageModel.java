package com.example.lab6;



public class MortgageModel {
    double principle;
    int amortization;
    double interest;



    public MortgageModel(String p, String a, String i){

        this.principle = Double.valueOf(p).doubleValue();
        this.amortization = Integer.valueOf(a).intValue();
        this.interest =Double.valueOf(i).doubleValue();

    }

    public String computePayment(){

        int n = amortization*12;
        double r = interest/100/12;
        double monthlyPayment = (r*principle)/(1-(1/(Math.pow(1+r,n))));
        return String.format("%,.2f",monthlyPayment);
    }
}