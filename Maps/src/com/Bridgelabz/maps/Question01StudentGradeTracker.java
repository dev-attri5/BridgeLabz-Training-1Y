package com.Bridgelabz.maps;

import java.util.*;

public class Question01StudentGradeTracker {
    public static void main(String[] args) {
        Map<String, Integer> grades = new TreeMap<>();
        grades.put("Aarav", 82);
        grades.put("Diya", 91);
        grades.put("Ishaan", 76);
        grades.put("Meera", 88);

        grades.put("Aarav", 85);
        grades.remove("Ishaan");

        System.out.println("Students and grades in alphabetical order:");
        grades.forEach((student, grade) -> System.out.println(student + " -> " + grade));
    }
}
