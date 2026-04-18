package com.Bridgelabz.maps;

import java.util.*;

public class WarmUp03InvertMap {
    public static void main(String[] args) {
        Map<String, Integer> input = new LinkedHashMap<>();
        input.put("A", 1);
        input.put("B", 2);
        input.put("C", 1);
        input.put("D", 3);

        Map<Integer, List<String>> inverted = new TreeMap<>();
        for (Map.Entry<String, Integer> entry : input.entrySet()) {
            inverted.computeIfAbsent(entry.getValue(), key -> new ArrayList<>()).add(entry.getKey());
        }

        System.out.println("Input: " + input);
        System.out.println("Inverted: " + inverted);
    }
}
