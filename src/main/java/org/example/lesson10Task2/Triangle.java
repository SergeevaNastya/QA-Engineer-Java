package org.example.lesson10Task2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Triangle extends Shape {
    private double oneSide;
    private double twoSide;
    private double thirdSide;

    public Triangle(String fillColour, String borderColour, double oneSide, double twoSide, double thirdSide) {
        super(fillColour, borderColour);
        this.oneSide = oneSide;
        this.twoSide = twoSide;
        this.thirdSide = thirdSide;
    }

    @Override
    public double calculatePerimeter() {
        return oneSide + twoSide + thirdSide;
    }

    @Override
    public double calculateArea() {
        double halfPerimeter = calculatePerimeter() / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - oneSide) * (halfPerimeter - twoSide) * (halfPerimeter -thirdSide));
    }
}