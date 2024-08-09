package org.example.Lesson_10_Task2;

import lombok.Data;

@Data
abstract public class Shape implements ShapeCalculations {
    private String fillColour;
    private String borderColour;

    public Shape(String fillColour, String borderColour) {
        this.fillColour = fillColour;
        this.borderColour = borderColour;
    }
}
