package com.Bridgelabz.maps;

import java.util.*;

public class Question14ExamResultsTopperPerSubject {
    public static void main(String[] args) {
        Map<String, Map<String, Integer>> subjectResults = new TreeMap<>();
        subjectResults.put("English", createScores("Aarav", 86, "Diya", 94, "Kabir", 88));
        subjectResults.put("Math", createScores("Aarav", 92, "Diya", 89, "Kabir", 97));
        subjectResults.put("Science", createScores("Aarav", 91, "Diya", 95, "Kabir", 90));

        for (Map.Entry<String, Map<String, Integer>> subjectEntry : subjectResults.entrySet()) {
            String subject = subjectEntry.getKey();
            Map<String, Integer> scores = subjectEntry.getValue();

            String topper = "";
            int topScore = -1;
            int total = 0;

            for (Map.Entry<String, Integer> scoreEntry : scores.entrySet()) {
                total += scoreEntry.getValue();
                if (scoreEntry.getValue() > topScore) {
                    topScore = scoreEntry.getValue();
                    topper = scoreEntry.getKey();
                }
            }

            System.out.println(subject + " -> " + scores);
            System.out.println("Topper: " + topper + " (" + topScore + ")");
            System.out.println("Average: " + (total / (double) scores.size()));
        }

        System.out.println("Subjects with at least one score above 90:");
        for (Map.Entry<String, Map<String, Integer>> entry : subjectResults.entrySet()) {
            boolean found = false;
            for (int score : entry.getValue().values()) {
                if (score > 90) {
                    found = true;
                    break;
                }
            }
            if (found) {
                System.out.println(entry.getKey());
            }
        }
    }

    private static Map<String, Integer> createScores(String s1, int m1, String s2, int m2, String s3, int m3) {
        Map<String, Integer> scores = new LinkedHashMap<>();
        scores.put(s1, m1);
        scores.put(s2, m2);
        scores.put(s3, m3);
        return scores;
    }
}
