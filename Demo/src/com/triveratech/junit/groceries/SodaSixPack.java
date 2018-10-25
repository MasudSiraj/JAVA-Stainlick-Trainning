package com.triveratech.junit.groceries;

import com.triveratech.junit.groceries.Grocery;

public class SodaSixPack implements Grocery {
    private int quantity;

    @Override
    public void setQuantity(int qty) {
        this.quantity = qty;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public boolean isTaxable() {
        return true;
    }

    @Override
    public int getPrice() {
        // determine multiples of 4
        int whole = getQuantity()/4;
        int remainder = getQuantity()%4;

        return whole*1200 + remainder*350;


    }

    public int getDeposit(){
        return getQuantity()*5;
    }
}
