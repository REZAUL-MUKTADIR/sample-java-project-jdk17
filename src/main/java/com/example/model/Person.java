package com.example.model;

public record Person(String firstName, String lastName, int age) {
    // Compact constructor for validation
    public Person {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
    }
    
    // Additional method
    public String fullName() {
        return firstName + " " + lastName;
    }
}