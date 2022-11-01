package com.github.miguelsombrero.benchmark;

import com.github.miguelsombrero.fibonacci.FibonacciCalculator;
import static  com.github.miguelsombrero.utils.TimeUtils.*;

public class MaxTimeFibonacciCalculatorBenchmarker implements FibonacciCalculatorBenchmarker {
    private long MAX_TIME_MILLISECONDS;

    public MaxTimeFibonacciCalculatorBenchmarker(long maxTimeMilliseconds) {
        this.MAX_TIME_MILLISECONDS = maxTimeMilliseconds;
    }

    public int benchmark(FibonacciCalculator calculator) {
        long start = getTime();

        int previousFibonacciNumber = -1;
        int fibonacciNumber = -1;

        for (int i = 2 ;; i++) {
            previousFibonacciNumber = fibonacciNumber;

            if (maxTimeExceeded(start, MAX_TIME_MILLISECONDS)) {
                System.out.println("Fibonacci calculator exits at time " + runningTime(start));
                System.out.println("Last calculated Fibonacci number with n = " + (i-1) + " is " + previousFibonacciNumber);
                return (i-1);
            }
            fibonacciNumber = calculator.calculate(i);
        }
    }

}