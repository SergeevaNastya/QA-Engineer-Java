package org.example.Lesson_13;

import lombok.Data;

import java.util.*;

@Data
public class WordsArray {
    private Set<String> uniqueWords;
    private Map<String, Integer> wordCount;

    public WordsArray(String[] words) {
        uniqueWords = new HashSet<>();
        wordCount = new HashMap<>();
        countWords(words);
    }

    private void countWords(String[] words) {
        for (String word : words) {
            uniqueWords.add(word);
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
    }

    public List<String> getUniqueWords() {
        return new ArrayList<>(uniqueWords);
    }

    public void printWords() {
        System.out.println("Уникальные слова: " + getUniqueWords());
        System.out.println("Количество каждого слова: " + getWordCount());
    }
}