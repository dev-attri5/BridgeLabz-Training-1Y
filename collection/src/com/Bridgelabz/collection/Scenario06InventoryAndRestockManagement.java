package com.Bridgelabz.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Scenario06InventoryAndRestockManagement {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        List<Product> products = new ArrayList<>();
        Queue<Product> restockQueue = new LinkedList<>();
        Stack<Product> restocked = new Stack<>();

        addProduct(names, products, new Product("Rice", 60, 3));
        addProduct(names, products, new Product("Milk", 30, 9));
        addProduct(names, products, new Product("Rice", 60, 2));

        for (Product product : products) {
            if (product.stock < 5) {
                restockQueue.add(product);
            }
        }

        while (!restockQueue.isEmpty()) {
            Product product = restockQueue.remove();
            product.stock += 10;
            restocked.push(product);
            System.out.println("Restocked: " + product);
        }

        if (!restocked.isEmpty()) {
            Product last = restocked.pop();
            last.stock -= 10;
            System.out.println("Undo restock: " + last);
        }
    }

    private static void addProduct(Set<String> names, List<Product> products, Product product) {
        if (names.add(product.name)) {
            products.add(product);
        }
    }

    private static final class Product {
        private final String name;
        private final double price;
        private int stock;

        private Product(String name, double price, int stock) {
            this.name = name;
            this.price = price;
            this.stock = stock;
        }

        @Override
        public String toString() {
            return name + " (price=" + price + ", stock=" + stock + ")";
        }

        @Override
        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof Product other)) {
                return false;
            }
            return Objects.equals(name, other.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }
}
