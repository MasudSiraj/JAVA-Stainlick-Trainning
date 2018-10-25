package com.triveratech.tdd;

public class Calculator {
    public int add(int i, int j) {
        long longResult = (long)i + (long)j;
        int intResult = i + j;
        if (longResult != intResult) {
            throw new RuntimeException("Overflow! Run!");
        }
        return (int) longResult;
    }
}
