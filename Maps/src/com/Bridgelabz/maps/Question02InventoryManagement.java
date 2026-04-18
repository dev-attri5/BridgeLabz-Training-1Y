package com.Bridgelabz.maps;

import java.util.*;

public class Question02InventoryManagement {
    public static void main(String[] args) {
        Map<String, Integer> inventory = new TreeMap<>();
        inventory.put("Apples", 40);
        inventory.put("Biscuits", 15);
        inventory.put("Milk", 8);
        inventory.put("Rice", 0);

        buyProduct(inventory, "Milk", 4);
        buyProduct(inventory, "Biscuits", 15);
        restockProduct(inventory, "Milk", 12);
        restockProduct(inventory, "Bread", 20);

        System.out.println("Inventory after actions: " + inventory);
        System.out.println("Milk remaining: " + inventory.getOrDefault("Milk", 0));
        System.out.println("Soap remaining: " + (inventory.containsKey("Soap") ? inventory.get("Soap") : "Not stocked"));

        List<String> outOfStock = inventory.entrySet().stream()
                .filter(entry -> entry.getValue() <= 0)
                .map(Map.Entry::getKey)
                .toList();
        System.out.println("Out-of-stock products: " + outOfStock);
    }

    private static void buyProduct(Map<String, Integer> inventory, String product, int quantity) {
        int current = inventory.getOrDefault(product, 0);
        int updated = current - quantity;
        inventory.put(product, Math.max(updated, 0));
    }

    private static void restockProduct(Map<String, Integer> inventory, String product, int quantity) {
        inventory.put(product, inventory.getOrDefault(product, 0) + quantity);
    }
}
