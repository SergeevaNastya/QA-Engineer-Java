package org.example;

import org.example.Lesson_14_junit_5.FactorialJunit;

public class Main {
    public static void main(String[] args) {
        FactorialJunit factorial = new FactorialJunit();

        System.out.println(factorial.getFactorial(0));
    }
}