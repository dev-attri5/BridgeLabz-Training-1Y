package com.Bridgelabz.Generics;

import java.util.*;

public class GenericProblem12WarehouseSystem {
    public static void main(String[] args) {
        Storage<ElectronicsItem> electronicsStorage = new Storage<>();
        electronicsStorage.store(new ElectronicsItem("4K Monitor"));
        electronicsStorage.store(new ElectronicsItem("Printer"));

        Storage<GroceryItem> groceryStorage = new Storage<>();
        groceryStorage.store(new GroceryItem("Rice Bag"));
        groceryStorage.store(new GroceryItem("Milk Pack"));

        displayAllItems(electronicsStorage.getItems());
        displayAllItems(groceryStorage.getItems());
    }

    private static void displayAllItems(List<? extends WarehouseItem> items) {
        System.out.println("Items in storage:");
        for (WarehouseItem item : items) {
            System.out.println("- " + item.getName());
        }
    }

    private abstract static class WarehouseItem {
        private final String name;

        WarehouseItem(String name) {
            this.name = name;
        }

        String getName() {
            return name;
        }
    }

    private static final class ElectronicsItem extends WarehouseItem {
        ElectronicsItem(String name) {
            super(name);
        }
    }

    private static final class GroceryItem extends WarehouseItem {
        GroceryItem(String name) {
            super(name);
        }
    }

    private static final class FurnitureItem extends WarehouseItem {
        FurnitureItem(String name) {
            super(name);
        }
    }

    private static final class Storage<T extends WarehouseItem> {
        private final List<T> items = new ArrayList<>();

        void store(T item) {
            items.add(item);
        }

        List<T> getItems() {
            return items;
        }
    }
}
