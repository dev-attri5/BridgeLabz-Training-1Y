package com.Bridgelabz.maps;

import java.util.*;

public class WarmUp05MergeTwoMaps {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new LinkedHashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);

        Map<String, Integer> map2 = new LinkedHashMap<>();
        map2.put("B", 3);
        map2.put("C", 4);
        map2.put("D", 5);

        Map<String, Integer> merged = new TreeMap<>(map1);
        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            merged.put(entry.getKey(), merged.getOrDefault(entry.getKey(), 0) + entry.getValue());
        }

        System.out.println("Map 1: " + map1);
        System.out.println("Map 2: " + map2);
        System.out.println("Merged: " + merged);
    }
}
