package com.Bridgelabz.collection;

import java.util.LinkedList;
import java.util.Queue;

public class Queue04StackUsingQueues {
    public static void main(String[] args) {
        QueueStack<Integer> stack = new QueueStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top: " + stack.top());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Top after pop: " + stack.top());
    }

    private static final class QueueStack<T> {
        private Queue<T> primary = new LinkedList<>();
        private Queue<T> secondary = new LinkedList<>();

        private void push(T value) {
            secondary.add(value);
            while (!primary.isEmpty()) {
                secondary.add(primary.remove());
            }
            Queue<T> temp = primary;
            primary = secondary;
            secondary = temp;
        }

        private T pop() {
            return primary.remove();
        }

        private T top() {
            return primary.element();
        }
    }
}
