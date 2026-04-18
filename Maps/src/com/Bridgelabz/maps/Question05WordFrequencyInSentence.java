package com.Bridgelabz.maps;

import java.util.*;

public class Question05WordFrequencyInSentence {
    public static void main(String[] args) {
        String sentence = "Java is fun, and Java is powerful!";
        String cleaned = sentence.toLowerCase().replaceAll("[^a-z0-9 ]", " ");
        String[] words = cleaned.split("\\s+");

        Map<String, Integer> frequency = new TreeMap<>();
        for (String word : words) {
            if (!word.isBlank()) {
                frequency.put(word, frequency.getOrDefault(word, 0) + 1);
            }
        }

        frequency.forEach((word, count) -> System.out.println(word + " -> " + count));
    }
}
