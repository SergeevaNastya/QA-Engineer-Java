package org.example.lesson13;

import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
public class WordsArray {
    private Map<String, Integer> wordCount;

    public WordsArray(String[] words) {
        wordCount = new HashMap<>();
        countWords(words);
    }

    private void countWords(String[] words) {
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
    }

    public List<String> getUniqueWords() {
        return new ArrayList<>(wordCount.keySet());
    }

    public void printWords() {
        System.out.println("Уникальные слова: " + getUniqueWords());
        System.out.println("Количество каждого слова: " + getWordCount());
    }
}