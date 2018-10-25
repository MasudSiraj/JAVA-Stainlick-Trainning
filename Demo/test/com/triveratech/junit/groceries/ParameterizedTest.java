package com.triveratech.junit.groceries;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.*;


import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

@RunWith(Parameterized.class)
public class ParameterizedTest {

    private int quantity;
    private Size size;

    public ParameterizedTest(int quantity, Size size){
        this.quantity=quantity;
        this.size=size;
    }

    @Parameters(name = "Run: Qty={0} Size={1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {3, Size.LARGE},
                        {2, Size.MEDIUM},
                        {4, Size.LARGE},
                        {7, Size.MEDIUM},
                        {10, Size.SMALL}
                });
    }

    @Test
    public void testCerealPrice(){
        Cereal c = new Cereal(quantity,size);
        assertThat(c.getPrice(), is(quantity*size.getPrice()));
    }
}
