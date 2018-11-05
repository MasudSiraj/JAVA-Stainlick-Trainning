package com.triveratech.junit.groceries;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;



public class HamcrestSoupTest {
//
//    @Test
//    public void test() {
//        Grocery g = new Soup();
//        g.setQuantity(3);
//        assertThat(g.getPrice(), is(300));
//
//        assertThat(g.getPrice(), not(375));
//        assertThat(g.getPrice(), is(not(375)));
//        assertThat(g.getPrice(), not(is(375)));
//        assertThat(g.getPrice(), is(300));
//        assertThat(g.getPrice(), not(not(300)));
//        assertThat(g.getPrice(), not(is(not(300))));
//    }
//
//    @Test
//    public void numberTest() {
//        Grocery soup = new Soup();
//        soup.setQuantity(4);
//        Grocery dishSoap = new DishSoap();
//        dishSoap.setQuantity(3);
//        assertThat(soup.getPrice(), not(lessThan(dishSoap.getPrice())));
//    }
//
//    @Test
//    public void collectionsTest(){
//        List<Integer> prices = new ArrayList<Integer>();
//        Grocery g1 = new Soup();
//        Grocery g2 = new DishSoap();
//        Grocery g3 = new SodaSixPack();
//        g1.setQuantity(3);
//        g2.setQuantity(3);
//        g3.setQuantity(3);
//        prices.add(g1.getPrice());
//        prices.add(g2.getPrice());
//        prices.add(g3.getPrice());
//        assertThat(prices, hasItem(lessThan(500)) );
//        assertThat(prices, hasItem(greaterThan(800)) );
//    }
}
