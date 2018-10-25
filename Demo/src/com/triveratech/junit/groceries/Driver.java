package com.triveratech.junit.groceries;

public class Driver {

    public static void main(String[] args) {
        SodaSixPack ssp = new SodaSixPack();
        ssp.setQuantity(4);
        System.out.printf(
                "Quantity %d, Price %d, Deposit %d%n",
                ssp.getQuantity(),ssp.getPrice(),ssp.getDeposit());


        ssp.setQuantity(5);
        System.out.printf(
                "Quantity %d, Price %d, Deposit %d%n",
                ssp.getQuantity(),ssp.getPrice(),ssp.getDeposit());


        ssp.setQuantity(10);
        System.out.printf(
                "Quantity %d, Price %d, Deposit %d%n",
                ssp.getQuantity(),ssp.getPrice(),ssp.getDeposit());
}
}
