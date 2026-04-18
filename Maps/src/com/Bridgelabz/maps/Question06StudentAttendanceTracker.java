package com.Bridgelabz.maps;

import java.util.*;

public class Question06StudentAttendanceTracker {
    public static void main(String[] args) {
        Map<String, Integer> attendance = new TreeMap<>();
        List<String> students = List.of("Aarav", "Diya", "Kabir", "Meera", "Siya");
        for (String student : students) {
            attendance.put(student, 0);
        }

        List<List<String>> days = List.of(
                List.of("Aarav", "Diya", "Kabir"),
                List.of("Aarav", "Meera", "Siya"),
                List.of("Diya", "Kabir", "Siya"),
                List.of("Aarav", "Diya", "Meera"),
                List.of("Kabir", "Meera"),
                List.of("Aarav", "Diya", "Siya"),
                List.of("Aarav", "Kabir", "Meera", "Siya"),
                List.of("Diya", "Kabir"),
                List.of("Aarav", "Diya", "Kabir", "Meera"),
                List.of("Aarav", "Siya"),
                List.of("Diya", "Kabir", "Meera"),
                List.of("Aarav", "Diya", "Kabir", "Siya"),
                List.of("Aarav", "Meera"),
                List.of("Kabir", "Siya"),
                List.of("Aarav", "Diya", "Meera", "Siya")
        );

        for (List<String> presentStudents : days) {
            for (String student : presentStudents) {
                attendance.put(student, attendance.get(student) + 1);
            }
        }

        System.out.println("Attendance totals: " + attendance);
        System.out.println("Students present fewer than 10 days:");
        attendance.forEach((student, daysPresent) -> {
            if (daysPresent < 10) {
                System.out.println(student + " -> " + daysPresent);
            }
        });
    }
}
