package com.github.miguelsombrero.fibonacci;

public class RecursiveFibonacciCalculator implements FibonacciCalculator {
    public int calculate(int nth) {
        if (nth <= 1) {
            return nth;
        }
        return calculate(nth-1) + calculate(nth-2);
    }
}
