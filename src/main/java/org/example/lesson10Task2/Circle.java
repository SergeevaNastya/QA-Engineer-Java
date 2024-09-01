package org.example.lesson10Task2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Circle extends Shape {
    private double radius;

    public Circle(String fillColour, String borderColour, double radius) {
        super(fillColour, borderColour);
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateArea() {
        return radius * radius * Math.PI;
    }
}