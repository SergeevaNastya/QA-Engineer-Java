package org.example;

import org.example.Lesson_13.PhoneBook;
import org.example.Lesson_13.WordsArray;
import org.example.Lesson_14_junit_5.FactorialJunit;

public class Main {
    public static void main(String[] args) {
        String[] words = {"яблоко", "груша", "яблоко"};

        WordsArray wordsArray = new WordsArray(words);

        wordsArray.printWords();

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Сергеева", "33-45-57");
        phoneBook.add("Сергеева", "33-45-57"); // Дубликат, не будет добавлен
        phoneBook.add("Виноградов", "55-85-99");
        phoneBook.add("Виноградов", "55-85-99");

        phoneBook.printBook();
    }
}