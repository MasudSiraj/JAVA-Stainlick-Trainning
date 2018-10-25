package com.trivreatech.tdd;

import org.junit.Before;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() throws Exception {
        this.calculator = new Calculator();
    }

    public void testAdd(){
        int expected = 1;
        int actual = calculator.add(1,0);
        assertEquals(expected, actual);

    }
}