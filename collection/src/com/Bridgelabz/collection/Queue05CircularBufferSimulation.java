package com.Bridgelabz.collection;

import java.util.ArrayList;
import java.util.List;

public class Queue05CircularBufferSimulation {
    public static void main(String[] args) {
        CircularBuffer buffer = new CircularBuffer(3);
        buffer.add(1);
        buffer.add(2);
        buffer.add(3);
        buffer.add(4);

        System.out.println("Buffer: " + buffer.asList());
    }

    private static final class CircularBuffer {
        private final int[] values;
        private int start;
        private int size;

        private CircularBuffer(int capacity) {
            values = new int[capacity];
        }

        private void add(int value) {
            if (size < values.length) {
                values[(start + size) % values.length] = value;
                size++;
            } else {
                values[start] = value;
                start = (start + 1) % values.length;
            }
        }

        private List<Integer> asList() {
            List<Integer> result = new ArrayList<>();
            for (int index = 0; index < size; index++) {
                result.add(values[(start + index) % values.length]);
            }
            return result;
        }
    }
}
