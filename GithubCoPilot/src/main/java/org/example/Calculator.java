package org.example;

public class Calculator {

    private static int value;

    public Calculator() {
        value = 0;
    }
    public int sumPositiveIntegers(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Only positive integers are allowed");
        }
        return a + b;
    }

    public void resetCalculator() {
        value = 0;
    }

    public int add(int a) {
        value = value+a;
        return value;
    }

    public int getCurrentValue() {
        return value;
    }
}
