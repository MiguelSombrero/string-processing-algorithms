package com.github.miguelsombrero;

import com.github.miguelsombrero.fibonacci.RecursiveFibonacciCalculator;

public class Main {

    public static void main(String[] args) {
        RecursiveFibonacciCalculator recursiveFibonacciCalculator = new RecursiveFibonacciCalculator();

        int result = recursiveFibonacciCalculator.calculate(10);

        System.out.println(result);
    }
}
