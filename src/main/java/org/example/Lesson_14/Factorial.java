package org.example.Lesson_14;

public class Factorial {
    public int getFactorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Число не может быть отрицательным!");
        }
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}