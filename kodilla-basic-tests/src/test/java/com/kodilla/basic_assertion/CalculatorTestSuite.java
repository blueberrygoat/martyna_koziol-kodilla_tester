package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSub() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int subResult = calculator.sub(a, b);
        assertEquals(-3, subResult);
    }

    @Test
    public void testSquared() {
        Calculator calculator = new Calculator();
        int a = 5;
        int squaredResult = calculator.squared(a);
        assertEquals(25, squaredResult);
    }

    @Test
    public void testSquared2() {
        Calculator calculator = new Calculator();
        double a = 5;
        double squared2Result = calculator.squared2(a);
        assertEquals(25, squared2Result, 0.01);

    }
}
