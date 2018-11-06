package com.triveratech.junit.groceries;

import org.junit.Before;
import org.junit.Test;

public class VariableScope {
    //Type          object reference variable name
    SodaSixPack     one;


    @Before
    public void fred(){
        one = new SodaSixPack(15);
    }

    @Test
    public void test_one_sixPack(){
        one.getDeposit();
    }

}
