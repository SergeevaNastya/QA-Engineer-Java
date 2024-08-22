package org.example;

import org.example.Lesson_12.*;
import org.example.Lesson_13.WordsArray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[] words = {"Кот", "Машина", "Кот", "Стул", "Зеркало", "Ковёр",
                "Шторы", "Собака", "Кот", "Кот", "Тетрадь", "88888"};

        WordsArray wordsArray = new WordsArray(words);
        wordsArray.printWords();
    }
}