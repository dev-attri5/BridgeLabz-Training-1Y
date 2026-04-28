package com.logisticsroutetracker;

import java.util.HashSet;
import java.util.Set;

public class RouteLinkedList<T extends Checkpoint> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public void addCheckpoint(T checkpoint) {
        Node<T> node = new Node<>(checkpoint);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public boolean removeCheckpoint(String checkpointId) {
        Node<T> current = head;
        Node<T> previous = null;

        while (current != null) {
            if (current.value.getCheckpointId().equals(checkpointId)) {
                if (previous == null) {
                    head = current.next;
                } else {
                    previous.next = current.next;
                }

                if (current == tail) {
                    tail = previous;
                }

                size--;
                return true;
            }
            previous = current;
            current = current.next;
        }

        return false;
    }

    public T findCheckpoint(String checkpointId) {
        Node<T> current = head;
        while (current != null) {
            if (current.value.getCheckpointId().equals(checkpointId)) {
                return current.value;
            }
            current = current.next;
        }
        return null;
    }

    public double computeTotalDistance() {
        double total = 0.0;
        Node<T> current = head;
        while (current != null) {
            total += current.value.getDistanceFromLast();
            current = current.next;
        }
        return total;
    }

    public double computeTotalPenalty() {
        double total = 0.0;
        Node<T> current = head;
        while (current != null) {
            total += current.value.calculatePenalty();
            current = current.next;
        }
        return total;
    }

    public boolean hasAllCriticalCheckpointTypes(String... requiredTypes) {
        Set<String> presentCriticalTypes = new HashSet<>();
        Node<T> current = head;
        while (current != null) {
            if (current.value.isCritical()) {
                presentCriticalTypes.add(current.value.getType());
            }
            current = current.next;
        }

        for (String requiredType : requiredTypes) {
            if (!presentCriticalTypes.contains(requiredType)) {
                return false;
            }
        }
        return true;
    }

    public void printRoute() {
        Node<T> current = head;
        int index = 1;
        while (current != null) {
            Checkpoint checkpoint = current.value;
            System.out.printf(
                    "%d. %sCheckpoint - %s - %s - Penalty: %.1f%n",
                    index,
                    checkpoint.getType(),
                    checkpoint.getLocationName(),
                    checkpoint.getStatus(),
                    checkpoint.calculatePenalty()
            );
            current = current.next;
            index++;
        }
    }

    public int size() {
        return size;
    }

    private static final class Node<T extends Checkpoint> {
        private final T value;
        private Node<T> next;

        private Node(T value) {
            this.value = value;
        }
    }
}
