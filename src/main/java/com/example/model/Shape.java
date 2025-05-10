package com.example.model;

public sealed interface Shape permits Shape.Circle, Shape.Rectangle {
    record Circle(double radius) implements Shape {}
    record Rectangle(double length, double width) implements Shape {}
}