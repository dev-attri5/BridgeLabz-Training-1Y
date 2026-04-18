package com.Bridgelabz.collection;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Scenario01ECommerceOrderProcessing {
    public static void main(String[] args) {
        Set<Order> uniqueOrders = new LinkedHashSet<>(Arrays.asList(
                new Order("O101", "Laptop"),
                new Order("O102", "Headphones"),
                new Order("O101", "Duplicate Laptop"),
                new Order("O103", "Keyboard")
        ));

        Queue<Order> processingQueue = new LinkedList<>(uniqueOrders);
        Stack<Order> failedOrders = new Stack<>();

        while (!processingQueue.isEmpty()) {
            Order order = processingQueue.remove();
            if ("O102".equals(order.id)) {
                failedOrders.push(order);
            } else {
                System.out.println("Processed: " + order);
            }
        }

        while (!failedOrders.isEmpty()) {
            System.out.println("Retrying: " + failedOrders.pop());
        }
    }

    private static final class Order {
        private final String id;
        private final String item;

        private Order(String id, String item) {
            this.id = id;
            this.item = item;
        }

        @Override
        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof Order other)) {
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
            return id + " (" + item + ")";
        }
    }
}
