package com.github.miguelsombrero.fibonacci;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FibonacciCalculatorTest {
    private int input;
    private int expected;

    public FibonacciCalculatorTest(int input, int expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection fibonacciNumbers() {
        return Arrays.asList(new Object[][] {
                { 3, 2 },
                { 4, 3 },
                { 5, 5 },
                { 6, 8 },
                { 7, 13 },
                { 8, 21 },
                { 9, 34 },
                { 10, 55 },
                { 11, 89 },
                { 12, 144 }
        });
    }

    @Test
    public void recursiveFibonacciCalculatorWorksCorrectly() {
        FibonacciCalculator calculator = new RecursiveFibonacciCalculator();
        assertEquals(expected, calculator.calculate(input));
    }

    @Test
    public void dynamicFibonacciCalculatorWorksCorrectly() {
        FibonacciCalculator calculator = new DynamicFibonacciCalculator();
        assertEquals(expected, calculator.calculate(input));
    }
}
