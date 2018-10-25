package com.triveratech.tdd;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() throws Exception {
        this.calculator = new Calculator();
    }

    @Test
    public void testAdd(){
        int expected = 1;
        int actual = calculator.add(1,0);
        assertEquals(expected, actual);
    }


    @Test
    public void testAddBig(){
        try {
            this.calculator.add(Integer.MAX_VALUE, 1);
            fail("Calculator.add() failed to throw an exception.");
        } catch (RuntimeException e) {
            // the call threw an exception, so the test passed.
        }
    }

}