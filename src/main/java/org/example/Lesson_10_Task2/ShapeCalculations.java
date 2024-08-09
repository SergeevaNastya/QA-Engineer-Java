package org.example.Lesson_10_Task2;

public interface ShapeCalculations {
    double calculatePerimeter();
    double calculateArea();

    default void printCalculation() {
        System.out.println(this.toString());
        System.out.println("Периметр: " + calculatePerimeter());
        System.out.println("Площадь: " + calculateArea());
    }
}