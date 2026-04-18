package com.Bridgelabz.collection;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Scenario10HospitalPatientManagement {
    public static void main(String[] args) {
        Set<Patient> admitted = new LinkedHashSet<>();
        Queue<Patient> waiting = new LinkedList<>();
        Stack<Patient> discharged = new Stack<>();
        List<Patient> history = new ArrayList<>();

        admit(admitted, waiting, history, new Patient("P1", "Isha"));
        admit(admitted, waiting, history, new Patient("P2", "Vikram"));

        while (!waiting.isEmpty()) {
            Patient patient = waiting.remove();
            admitted.remove(patient);
            discharged.push(patient);
            System.out.println("Treated: " + patient);
        }

        if (!discharged.isEmpty()) {
            Patient recent = discharged.pop();
            admit(admitted, waiting, history, recent);
            System.out.println("Re-admitted: " + recent);
        }
    }

    private static void admit(Set<Patient> admitted, Queue<Patient> waiting, List<Patient> history, Patient patient) {
        if (admitted.add(patient)) {
            waiting.add(patient);
            history.add(patient);
        }
    }

    private static final class Patient {
        private final String id;
        private final String name;

        private Patient(String id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof Patient other)) {
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
            return id + " - " + name;
        }
    }
}
