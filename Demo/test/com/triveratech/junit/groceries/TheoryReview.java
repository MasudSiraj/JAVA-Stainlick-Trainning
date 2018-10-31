package com.triveratech.junit.groceries;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import static junit.framework.TestCase.assertTrue;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(Theories.class)
public class TheoryReview {

    private static long testCount;



    @DataPoint public static int a=1;
    @DataPoint public static int b=2;
    @DataPoint public static int c=3;
    @DataPoint public static int d=4;
    @DataPoint public static int e=5;

    @Before
    public void beforeEach(){
        testCount++;
    }

    @AfterClass
    public static void afterFinished(){
        assertTrue(testCount==25);
        System.out.println("There were " + testCount + " scenarios executed");
    }


    @Theory
    public void testPermutations(int a, int b){

        //System.out.printf("Testing with %d and %d \n", a, b);

    }
}
