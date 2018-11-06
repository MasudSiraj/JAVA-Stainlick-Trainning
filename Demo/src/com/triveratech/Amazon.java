package com.triveratech;

import com.triveratech.Inventory;

import java.util.ArrayList;
import java.util.Collection;

public class Amazon extends Object{

    private Collection<Inventory> warehouse = new ArrayList<>();

    public void addInventory(Collection<Inventory> inventory) {
        warehouse.addAll(inventory);
    }
    public int getNoOfItemsInInventory(){
        return warehouse.size();
    }
}
