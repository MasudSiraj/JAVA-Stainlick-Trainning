package com.triveratech.junit.groceries;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GroceryTest {


    @Test(expected = AssertionError.class)
    public void test_order_for_zero_six_packs(){
        SodaSixPack sixPack = new SodaSixPack(0);
    }

    @Test(expected = NullPointerException.class)
    public void test_order_for_pringles_with_null_vendor(){
        Pringles pringles = new Pringles();
        pringles.setVendor(null);
    }

    @Test
    public void test_order_for_one_six_pack(){
        SodaSixPack sixPack = new SodaSixPack(1);
        assertEquals((int)PricingRules.getRules().get("SIX_PACK_PRICE"), sixPack.getPrice());
        assertEquals((int)PricingRules.getRules().get("SIX_PACK_DEPOSIT"), sixPack.getDeposit());
    }

    @Test
    public void test_order_for_four_six_packs(){

        SodaSixPack sixPack = new SodaSixPack(4);
        assertEquals(1200, sixPack.getPrice());
        assertEquals(4*30, sixPack.getDeposit());
    }

    @Test
    public void test_order_for_five_six_packs(){

        SodaSixPack sixPack = new SodaSixPack(5);
    }
}
