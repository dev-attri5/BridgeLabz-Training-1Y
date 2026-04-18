package com.Bridgelabz.collection;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class List02ElementFrequency {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange");
        Map<String, Integer> frequency = new LinkedHashMap<>();

        for (String word : words) {
            frequency.put(word, frequency.getOrDefault(word, 0) + 1);
        }

        System.out.println("Input: " + words);
        System.out.println("Frequency: " + frequency);
    }
}
