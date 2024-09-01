package org.example.lesson13;

import lombok.Data;
import java.util.*;

@Data
public class PhoneBook {
    private Map<String, List<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void add(String lastName, String phoneNumber){
        List<String> phoneNumbers = phoneBook.get(lastName);
        if (phoneNumbers == null) {
            phoneNumbers = new ArrayList<>();
            phoneBook.put(lastName, phoneNumbers);
        }
        phoneNumbers.add(phoneNumber);
    }

    public List<String> get(String lastName) {
        return phoneBook.getOrDefault(lastName, Collections.emptyList());
    }
}