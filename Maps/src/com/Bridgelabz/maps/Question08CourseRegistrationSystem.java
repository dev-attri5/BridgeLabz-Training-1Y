package com.Bridgelabz.maps;

import java.util.*;

public class Question08CourseRegistrationSystem {
    public static void main(String[] args) {
        Map<String, Integer> registrations = new TreeMap<>();
        registrations.put("CS101", 42);
        registrations.put("MA201", 51);
        registrations.put("PH105", 27);
        registrations.put("EC210", 50);
        registrations.put("HS110", 18);

        registrations.put("CS101", registrations.get("CS101") + 5);
        registrations.put("PH105", Math.max(0, registrations.get("PH105") - 7));
        registrations.put("HS110", Math.max(0, registrations.get("HS110") - 20));

        System.out.println("Registrations: " + registrations);

        List<String> nearFull = registrations.entrySet().stream()
                .filter(entry -> entry.getValue() >= 50)
                .map(entry -> entry.getKey() + "(" + entry.getValue() + ")")
                .toList();

        List<String> underSubscribed = registrations.entrySet().stream()
                .filter(entry -> entry.getValue() < 25)
                .map(entry -> entry.getKey() + "(" + entry.getValue() + ")")
                .toList();

        System.out.println("Near full courses: " + nearFull);
        System.out.println("Under-subscribed courses: " + underSubscribed);
    }
}
