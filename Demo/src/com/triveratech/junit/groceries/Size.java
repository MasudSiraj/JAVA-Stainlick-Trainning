package com.triveratech.junit.groceries;

public enum Size {

    SMALL(200),
    MEDIUM(275),
    LARGE(300);

    private int price;

    Size(int price){this.price=price;}

    public int getPrice() {return this.price;}
}
