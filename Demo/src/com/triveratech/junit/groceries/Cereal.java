package com.triveratech.junit.groceries;

public class Cereal implements Grocery {
    private Integer quantity;
    private Size size;


    public Cereal(){}
    public Cereal(int quantity, Size size) {
        this.quantity=quantity;
        this.size = size;
    }


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
        return getQuantity() * size.getPrice();


    }


}
