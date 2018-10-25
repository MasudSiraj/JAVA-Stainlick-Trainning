package com.triveratech.junit.groceries;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.anyOf;
import static org.junit.Assume.assumeThat;

@RunWith(Theories.class)
public class TheoryTest {

    private static long testCount;

    @DataPoint public static Size small = Size.SMALL;
    @DataPoint public static Size medium = Size.MEDIUM;
    @DataPoint public static Size large = Size.LARGE;

    @DataPoints
    public static int[] ints(){
        return new int[]{1,2,5,10,17,20,35,47};
    }

    @Before
    public void beforeEach(){
        testCount++;
    }

    @AfterClass
    public static void afterFinished(){
        System.out.println("There were " + testCount + " scenarios executed");
    }

    @Theory
    public void testCerealPrice(int quantity, Size size){
        Cereal c = new Cereal(quantity,size);

        //filter IN only small sizes
//        assumeThat(size, anyOf(is(Size.SMALL)));

        assertThat(c.getPrice(), is(quantity*size.getPrice()));
        System.out.format("quantity=%s, size=%s", quantity, size).println();

    }
}
