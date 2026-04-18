package com.Bridgelabz.maps;

import java.util.*;
public class Question10WebsiteVisitTracker {
    public static void main(String[] args) {
        List<String> pages = List.of(
                "home", "about", "products", "home", "products",
                "contact", "home", "blog", "products", "home"
        );

        Map<String, Integer> visits = new LinkedHashMap<>();
        for (String page : pages) {
            visits.put(page, visits.getOrDefault(page, 0) + 1);
        }

        List<Map.Entry<String, Integer>> sorted = new ArrayList<>(visits.entrySet());
        sorted.sort(Map.Entry.<String, Integer>comparingByValue(Comparator.reverseOrder())
                .thenComparing(Map.Entry.comparingByKey()));

        System.out.println("Pages sorted by descending visits:");
        for (Map.Entry<String, Integer> entry : sorted) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("Most visited page: " + sorted.get(0).getKey());
    }
}
