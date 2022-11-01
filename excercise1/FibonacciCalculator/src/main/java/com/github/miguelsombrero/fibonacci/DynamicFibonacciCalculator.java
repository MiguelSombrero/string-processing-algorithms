package com.github.miguelsombrero.fibonacci;

public class DynamicFibonacciCalculator implements FibonacciCalculator {
    public int calculate(int nth) {
        int[] fibonaccis = new int[nth+2];
        fibonaccis[0] = 0;
        fibonaccis[1] = 1;

        for (int i = 2; i<=nth; i++) {
            fibonaccis[i] = fibonaccis[i-1] + fibonaccis[i-2];
        }

        return fibonaccis[nth];
    }
}
