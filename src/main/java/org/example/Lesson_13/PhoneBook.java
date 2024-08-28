package org.example.Lesson_13;

import lombok.Data;
import java.util.*;

@Data
public class PhoneBook {
    private Map<String, Set<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void add(String lastName, String phoneNumber){
        Set<String> phoneNumbers = phoneBook.computeIfAbsent(lastName, k -> new HashSet<>());
        phoneNumbers.add(phoneNumber);
    }

    public void printBook() {
        phoneBook.forEach((lastName, phoneNumbers) ->
                System.out.println(lastName + ": " + phoneNumbers));
    }
}