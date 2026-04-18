package com.Bridgelabz.maps;

import java.util.*;
public class WarmUp01StudentSubjectMarks {
    public static void main(String[] args) {
        Map<String, Map<String, Integer>> marksByStudent = new TreeMap<>();

        marksByStudent.put("Aarav", createScores("Math", 95, "Science", 88, "English", 91));
        marksByStudent.put("Diya", createScores("Math", 89, "Science", 97, "English", 93));
        marksByStudent.put("Kabir", createScores("Math", 99, "Science", 84, "English", 87));

        System.out.println("Student -> Subject Marks");
        marksByStudent.forEach((student, scores) -> System.out.println(student + " -> " + scores));

        Set<String> subjects = new LinkedHashSet<>();
        marksByStudent.values().forEach(scores -> subjects.addAll(scores.keySet()));

        Map<String, String> toppers = new TreeMap<>();
        Map<String, Double> averages = new TreeMap<>();

        for (String subject : subjects) {
            String topStudent = "";
            int topScore = -1;
            int total = 0;
            int count = 0;

            for (Map.Entry<String, Map<String, Integer>> entry : marksByStudent.entrySet()) {
                int score = entry.getValue().get(subject);
                total += score;
                count++;
                if (score > topScore) {
                    topScore = score;
                    topStudent = entry.getKey();
                }
            }

            toppers.put(subject, topStudent + "(" + topScore + ")");
            averages.put(subject, total / (double) count);
        }

        System.out.println("Top scorer per subject: " + toppers);
        System.out.println("Average score per subject: " + averages);

        List<String> subjectsAbove90 = subjects.stream()
                .filter(subject -> marksByStudent.values().stream().anyMatch(scores -> scores.get(subject) > 90))
                .toList();
        System.out.println("Subjects with at least one student scoring above 90: " + subjectsAbove90);
    }

    private static Map<String, Integer> createScores(String s1, int m1, String s2, int m2, String s3, int m3) {
        Map<String, Integer> scores = new LinkedHashMap<>();
        scores.put(s1, m1);
        scores.put(s2, m2);
        scores.put(s3, m3);
        return scores;
    }
}
