package org.example;

import org.example.Lesson_12.*;
import org.example.Lesson_13.PhoneBook;
import org.example.Lesson_13.WordsArray;

public class Main {
    public static void main(String[] args) {
        String[] words = {"Кот", "Машина", "Кот", "Стул", "Зеркало", "Ковёр",
                "Шторы", "Собака", "Кот", "Кот", "Тетрадь", "88888"};

        WordsArray wordsArray = new WordsArray(words);

        wordsArray.printWords();

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Сергеева", "29-810-57-35");
        phoneBook.add("Виноградова", "33-345-24-48");
        phoneBook.add("Сергеева", "25-550-57-85");

        System.out.println("Номера по фамилии Сергеева: " + phoneBook.get("Сергеева"));
    }
}