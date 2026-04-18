package com.Bridgelabz.maps;

import java.util.Map;
import java.util.TreeMap;

public class WarmUp02WordFrequencyCounter {
    public static void main(String[] args) {
        String text = "Hello world, hello Java. Java makes the world better.";
        String cleaned = text.toLowerCase().replaceAll("[^a-z0-9 ]", " ");
        String[] words = cleaned.split("\\s+");

        Map<String, Integer> frequency = new TreeMap<>();
        for (String word : words) {
            if (!word.isBlank()) {
                frequency.put(word, frequency.getOrDefault(word, 0) + 1);
            }
        }

        System.out.println("Input: " + text);
        System.out.println("Output: " + frequency);
    }
}
