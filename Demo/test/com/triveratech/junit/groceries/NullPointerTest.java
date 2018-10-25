package com.triveratech.junit.groceries;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Test;

public class NullPointerTest {

    @Test(expected = NullPointerException.class)
    public void nullPointerTestA(){
        Grocery g = new Cereal();
        assertThat(0,is(g.getPrice()));
    }
}
