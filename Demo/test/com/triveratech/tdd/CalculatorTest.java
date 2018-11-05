package com.triveratech.tdd;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator = null;

    @Before
    public void beforeEachTestScenario(){
        calculator = new Calculator();
    }

    @Test
    public void scenarioToTestAdditionFunctionality(){
        int expected = 1;
        int actual = calculator.add(1,0);
        assertEquals(expected, actual);
    }

    @Test(expected = ArithmeticException.class)
    public void scenarioToTestTwoReallyLargeInts(){
        int actual = calculator.add(Integer.MAX_VALUE,1);
    }

}