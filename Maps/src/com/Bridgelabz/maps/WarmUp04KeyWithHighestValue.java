package com.Bridgelabz.maps;

import java.util.*;

public class WarmUp04KeyWithHighestValue {
    public static void main(String[] args) {
        Map<String, Integer> input = new LinkedHashMap<>();
        input.put("A", 10);
        input.put("B", 20);
        input.put("C", 15);
        input.put("D", 25);

        String maxKey = "";
        int maxValue = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : input.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }

        System.out.println("Input: " + input);
        System.out.println("Key with highest value: " + maxKey);
    }
}
