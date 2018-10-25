package com.triveratech.junit.groceries;

public interface Grocery {

    void setQuantity(int qty);
    int getQuantity();
    boolean isTaxable();
    int getPrice();
}
