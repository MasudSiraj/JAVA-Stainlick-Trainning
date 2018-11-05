package com.triveratech.junit.groceries;

import java.util.Objects;

public class Pringles implements Grocery {

    public void setQuantity(int qty) {

    }

    @Override
    public int getQuantity() {
        return 0;
    }

    @Override
    public boolean isTaxable() {
        return false;
    }

    @Override
    public int getPrice() {
        return 0;
    }

    public void setVendor(Vendor vendor){
        Objects.requireNonNull(vendor);

    }
}
