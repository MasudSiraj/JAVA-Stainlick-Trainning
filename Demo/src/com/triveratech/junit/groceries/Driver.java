package com.triveratech.junit.groceries;

public class Driver {

    public static void main(String[] args) {
//        SodaSixPack sixPack = new SodaSixPack();
//
//        sixPack.setQuantity(1);
//        printReceipt(sixPack);
//
//        sixPack.setQuantity(4);
//        printReceipt(sixPack);
//
//        sixPack.setQuantity(5);
//        printReceipt(sixPack);
//
//        sixPack.setQuantity(10);
//        printReceipt(sixPack);
    }

    private static void printReceipt(SodaSixPack ssp) {
        System.out.printf(
                "Quantity %d, Price %d, Deposit %d%n",
                ssp.getQuantity(), ssp.getPrice(), ssp.getDeposit());
    }
}
