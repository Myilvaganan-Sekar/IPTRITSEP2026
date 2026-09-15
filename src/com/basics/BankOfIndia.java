package com.basics;

public class BankOfIndia extends RbiBank{
    @Override
    public void rateOfInterest() {
        System.out.println("BOI rate of interest");
    }

    public static void main(String[] args) {
        BankOfIndia boi = new BankOfIndia();
        boi.rateOfInterest();
        boi.HomeLoan();
    }
}
