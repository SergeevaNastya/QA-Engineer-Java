package org.example.lesson10Task2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle(String fillColour, String borderColour, double width, double length) {
        super(fillColour, borderColour);
        this.width = width;
        this.length = length;
    }

    @Override
    public double calculatePerimeter() {
        return (length + width) * 2;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}