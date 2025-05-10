package com.example.service;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return (double) a / b;
    }
    
    // Using var for local variables
    public double calculateAverage(int... numbers) {
        if (numbers.length == 0) return 0;
        
        var sum = 0;
        for (var num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.length;
    }
}