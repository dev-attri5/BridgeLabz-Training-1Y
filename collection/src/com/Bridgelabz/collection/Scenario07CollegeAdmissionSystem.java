package com.Bridgelabz.collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class Scenario07CollegeAdmissionSystem {
    public static void main(String[] args) {
        List<Student> applicants = Arrays.asList(
                new Student("S201", "Anika", 91),
                new Student("S202", "Rohan", 78),
                new Student("S203", "Meera", 95)
        );

        Set<Student> shortlisted = new LinkedHashSet<>();
        Queue<Student> interviews = new LinkedList<>();
        TreeSet<Student> meritList = new TreeSet<>(Comparator.comparingInt(Student::getMarks).reversed().thenComparing(Student::getId));

        for (Student student : applicants) {
            if (student.marks >= 80) {
                shortlisted.add(student);
                interviews.add(student);
            }
        }

        while (!interviews.isEmpty()) {
            meritList.add(interviews.remove());
        }

        System.out.println("Shortlisted: " + shortlisted);
        System.out.println("Merit list: " + meritList);
    }

    private static final class Student {
        private final String id;
        private final String name;
        private final int marks;

        private Student(String id, String name, int marks) {
            this.id = id;
            this.name = name;
            this.marks = marks;
        }

        private String getId() {
            return id;
        }

        private int getMarks() {
            return marks;
        }

        @Override
        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof Student other)) {
                return false;
            }
            return Objects.equals(id, other.id);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }

        @Override
        public String toString() {
            return id + " - " + name + " (" + marks + ")";
        }
    }
}
