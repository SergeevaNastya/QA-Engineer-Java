package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.example.Lesson_4.Lesson_4.*;

public class Main {
    public static void main(String[] args) {
        printSomeText();
        checkSumSign();
        printColor();
        compareNumbers();
        checkSumWithinBounds(100, 5);
        checkPositiveOrNegative(0);
        System.out.println(checkTrueOrFalse(10));
        printStringMultipleTime("Hello", 5);
        isLeapYear(1881);
        toggleBit();
        setArrayValues();
        multiplyArray();
        fillArray(3);
        setArray(3, 0);
    }
}