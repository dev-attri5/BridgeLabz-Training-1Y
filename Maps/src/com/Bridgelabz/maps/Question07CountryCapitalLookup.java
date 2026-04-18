package com.Bridgelabz.maps;

import java.util.*;

public class Question07CountryCapitalLookup {
    public static void main(String[] args) {
        Map<String, String> capitals = new TreeMap<>();
        capitals.put("Australia", "Canberra");
        capitals.put("Brazil", "Brasilia");
        capitals.put("France", "Paris");
        capitals.put("Germany", "Berlin");
        capitals.put("India", "New Delhi");
        capitals.put("Japan", "Tokyo");
        capitals.put("Nepal", "Kathmandu");
        capitals.put("South Africa", "Pretoria");

        String country = "India";
        System.out.println("Capital of " + country + ": " + capitals.getOrDefault(country, "Unknown country"));

        System.out.println("All countries in alphabetical order:");
        capitals.forEach((name, capital) -> System.out.println(name + " -> " + capital));
    }
}
