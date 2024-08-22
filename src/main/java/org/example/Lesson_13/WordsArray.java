package org.example.Lesson_13;

import lombok.Data;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Data
public class WordsArray {
    private Map<String, Integer> wordCount = new HashMap<>();

    public WordsArray(String[] words) {
        wordCount = new HashMap<>();
        countWords(words);
    }

    private void countWords(String[] words) {
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
    }

    public void printWords() {
        System.out.println("Уникальные слова: " + wordCount.keySet());
        System.out.println("Количество каждого слова: " + getWordCount());
    }
}