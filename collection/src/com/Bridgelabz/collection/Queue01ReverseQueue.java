package com.Bridgelabz.collection;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Queue01ReverseQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>(Arrays.asList(10, 20, 30));
        reverse(queue);
        System.out.println("Reversed queue: " + queue);
    }

    private static <T> void reverse(Queue<T> queue) {
        if (queue.isEmpty()) {
            return;
        }

        T value = queue.remove();
        reverse(queue);
        queue.add(value);
    }
}
