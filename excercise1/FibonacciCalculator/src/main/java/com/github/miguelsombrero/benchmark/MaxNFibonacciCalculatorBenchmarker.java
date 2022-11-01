package com.github.miguelsombrero.benchmark;

import com.github.miguelsombrero.fibonacci.FibonacciCalculator;

import static com.github.miguelsombrero.utils.TimeUtils.*;

public class MaxNFibonacciCalculatorBenchmarker implements FibonacciCalculatorBenchmarker {
    private int MAX_N;

    public MaxNFibonacciCalculatorBenchmarker(int maxN) {
        this.MAX_N = maxN;
    }

    public int benchmark(FibonacciCalculator calculator) {
        long start = getTime();
        int fibonacciNumber = calculator.calculate(MAX_N);
        System.out.println("Fibonacci calculator exits at time " + runningTime(start));
        System.out.println("Calculated Fibonacci number with n = " + MAX_N + " is " + fibonacciNumber);
        return fibonacciNumber;
    }
}