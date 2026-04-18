package com.Bridgelabz.Generics;

import java.util.*;

public class GenericProblem09Cart {
    public static void main(String[] args) {
        Cart<Electronics> electronicsCart = new Cart<>();
        electronicsCart.addItem(new Electronics("Laptop"));
        electronicsCart.addItem(new Electronics("Bluetooth Speaker"));
        electronicsCart.removeItem(new Electronics("Bluetooth Speaker"));
        electronicsCart.displayItems("Electronics cart");

        Cart<Clothing> clothingCart = new Cart<>();
        clothingCart.addItem(new Clothing("T-Shirt"));
        clothingCart.addItem(new Clothing("Jacket"));
        clothingCart.displayItems("Clothing cart");
    }

    private static final class Cart<T> {
        private final List<T> items = new ArrayList<>();

        void addItem(T item) {
            items.add(item);
        }

        void removeItem(T item) {
            items.remove(item);
        }

        void displayItems(String label) {
            System.out.println(label + ": " + items);
        }
    }

    private record Electronics(String name) {
        @Override
        public String toString() {
            return name;
        }
    }

    private record Clothing(String name) {
        @Override
        public String toString() {
            return name;
        }
    }
}
