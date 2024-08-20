package org.example;

import org.example.Lesson_12.*;

public class Main {
    public static void main(String[] args) {
        String[][] correctArray = {
                {"5", "7", "1", "0"},
                {"5", "2", "9", "10"},
                {"11", "0", "-8", "5"},
                {"1", "3", "8", "8"}
        };

        String[][] incorrectArray = {
                {"1", "1"},
                {"1", "1"},
                {"1", "1"}
        };

        Task.validateArray(correctArray);
        Task.validateArray(incorrectArray);
    }
}