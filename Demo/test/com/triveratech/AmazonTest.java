package com.triveratech;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

public class AmazonTest {
    @Test
    public void add_two_hundredFifty_bikes_To_warehouse(){
        Amazon amazon=new Amazon();
        Collection<Inventory> trainCar=new ArrayList<>();
        for(int i=0;i<250;i++){
            trainCar.add(new Bike());
        }
        amazon.addInventory(trainCar);
        assertEquals(250,amazon.getNoOfItemsInInventory());
    };

}
