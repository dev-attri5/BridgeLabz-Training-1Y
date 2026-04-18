package com.Bridgelabz.collection;

import java.util.PriorityQueue;

public class Queue03HospitalTriageSystem {
    public static void main(String[] args) {
        PriorityQueue<Patient> queue = new PriorityQueue<>((a, b) -> Integer.compare(b.severity, a.severity));
        queue.add(new Patient("John", 3));
        queue.add(new Patient("Alice", 5));
        queue.add(new Patient("Bob", 2));

        while (!queue.isEmpty()) {
            System.out.println("Treating: " + queue.remove().name);
        }
    }

    private static final class Patient {
        private final String name;
        private final int severity;

        private Patient(String name, int severity) {
            this.name = name;
            this.severity = severity;
        }
    }
}
