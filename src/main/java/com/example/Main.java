package com.example;

import com.example.model.Person;
import com.example.model.Shape;
import com.example.model.Shape.Circle;
import com.example.model.Shape.Rectangle;
import com.example.service.Calculator;
import com.example.util.StringUtils;

public class Main {
    public static void main(String[] args) {
        System.out.println("Running with Java 17!");
        
        // Using records
        Person person = new Person("John", "Doe", 30);
        System.out.println("Person: " + person);
        
        // Using sealed classes
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);
        System.out.println("Circle area: " + calculateArea(circle));
        System.out.println("Rectangle area: " + calculateArea(rectangle));
        
        // Using enhanced Calculator
        Calculator calculator = new Calculator();
        System.out.println("2 + 3 = " + calculator.add(2, 3));
        
        // Using text blocks
        String json = """
            {
                "name": "%s",
                "age": %d
            }
            """.formatted(person.firstName(), person.age());
        System.out.println("JSON:\n" + json);
        
        // Using new String methods
        System.out.println("Is blank: " + StringUtils.isBlank("   "));
    }
    
    private static double calculateArea(Shape shape) {
        return switch (shape) {  // Enhanced switch expression
            case Circle c -> Math.PI * c.radius() * c.radius();
            case Rectangle r -> r.length() * r.width();
            // No default needed - sealed class ensures all cases are covered
        };
    }
}