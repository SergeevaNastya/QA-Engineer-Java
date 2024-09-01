package org.example.lesson4;

import java.util.Arrays;

public class Lesson_4 {
    // 1 задание
    public static void printSomeText() {
        System.out.println("Orange\nBanana\nApple");
    }

    // 2 задание
    public static void checkSumSign() {
        int a = 5;
        int b = -10;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    // 3 задание
    public static void printColor() {
        int value = 0;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    // 4 задание
    public static void compareNumbers() {
        int a = -1000;
        int b = -5;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    // 5 задание
    public static void checkSumWithinBounds(int a, int b) {
        System.out.println(a + b >= 10 && a + b <= 20);
    }

    // 6 задание
    public static void checkPositiveOrNegative(int a) {
        if (a >= 0) {
            System.out.println("Число является положительным");
        } else {
            System.out.println("Число является отрицательным");
        }
    }

    // 7 задание
    public static boolean checkTrueOrFalse(int a) {
        return a >= 0;
    }

    // 8 задание
    public static void printStringMultipleTime(String a, int b) {
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }

    // 9 задание
    public static void isLeapYear(int year) {
        System.out.println((year % 4 == 0 || year % 400 == 0) && year % 100 != 0);
    }

    // 10 задание
    public static void toggleBit() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    // 11 задание
    public static void setArrayValues() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(array));
    }

    // 12 задание
    public static void multiplyArray() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    // 13 задание
    public static void fillArray(int a) {
        int[][] table = new int[a][a];
        for (int i = 0; i < a; i++) {
            table[i][i] = 1;
            table[i][a - i - 1] = 1;
            for (int j = 0; j < a; j++) {
                System.out.printf(table[i][j] + " ");
            }
            System.out.println();
        }
    }

    // 14 задание
    public static void setArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        System.out.print(Arrays.toString(array));
    }
}
