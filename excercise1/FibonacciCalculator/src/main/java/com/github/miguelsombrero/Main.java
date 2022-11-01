package com.github.miguelsombrero;

import com.github.miguelsombrero.benchmark.FibonacciCalculatorBenchmarker;
import com.github.miguelsombrero.benchmark.MaxNFibonacciCalculatorBenchmarker;
import com.github.miguelsombrero.benchmark.MaxTimeFibonacciCalculatorBenchmarker;
import com.github.miguelsombrero.fibonacci.DynamicFibonacciCalculator;
import com.github.miguelsombrero.fibonacci.RecursiveFibonacciCalculator;

public class Main {

    public static void main(String[] args) {
        FibonacciCalculatorBenchmarker maxTimeBenchmarker = new MaxTimeFibonacciCalculatorBenchmarker(5000);

        RecursiveFibonacciCalculator recursiveFibonacciCalculator = new RecursiveFibonacciCalculator();

        int largestN = maxTimeBenchmarker.benchmark(recursiveFibonacciCalculator);

        FibonacciCalculatorBenchmarker nBenchmarker = new MaxNFibonacciCalculatorBenchmarker(largestN);

        DynamicFibonacciCalculator dynamicFibonacciCalculator = new DynamicFibonacciCalculator();

        nBenchmarker.benchmark(dynamicFibonacciCalculator);
    }
}
