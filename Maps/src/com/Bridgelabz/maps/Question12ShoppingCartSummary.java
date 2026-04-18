package com.Bridgelabz.maps;

import java.util.*;

public class Question12ShoppingCartSummary {
    public static void main(String[] args) {
        Map<String, Item> cart = new LinkedHashMap<>();
        cart.put("Laptop Sleeve", new Item(1200.0, 1));
        cart.put("Wireless Mouse", new Item(850.0, 2));
        cart.put("Mechanical Keyboard", new Item(3200.0, 1));
        cart.put("USB Cable", new Item(250.0, 0));

        cart.entrySet().removeIf(entry -> entry.getValue().quantity <= 0);

        System.out.println("Products in insertion order:");
        for (Map.Entry<String, Item> entry : cart.entrySet()) {
            System.out.printf(Locale.US, "%s -> price %.2f, qty %d%n",
                    entry.getKey(), entry.getValue().price, entry.getValue().quantity);
        }

        double total = 0;
        for (Item item : cart.values()) {
            total += item.price * item.quantity;
        }

        double finalAmount = total > 5000 ? total * 0.90 : total;
        System.out.printf(Locale.US, "Total bill: %.2f%n", total);
        if (finalAmount != total) {
            System.out.printf(Locale.US, "Discounted bill after 10%% off: %.2f%n", finalAmount);
        }
    }

    static class Item {
        double price;
        int quantity;

        Item(double price, int quantity) {
            this.price = price;
            this.quantity = quantity;
        }
    }
}
