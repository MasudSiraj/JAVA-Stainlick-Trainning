package com.triveratech.junit.groceries;

public class Soup implements Grocery {
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
        return getQuantity()*100;


    }

}
