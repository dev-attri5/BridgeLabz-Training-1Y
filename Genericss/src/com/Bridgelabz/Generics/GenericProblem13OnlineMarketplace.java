package com.Bridgelabz.Generics;

import java.util.*;

public class GenericProblem13OnlineMarketplace {
    public static void main(String[] args) {
        Product<BookCategory> book = new Product<>("Clean Code", new BookCategory("Programming"), 799);
        Product<ClothingCategory> shirt = new Product<>("Formal Shirt", new ClothingCategory("Office Wear"), 1499);
        Product<GadgetCategory> gadget = new Product<>("Smart Watch", new GadgetCategory("Wearable"), 4999);

        List<Product<? extends ProductCategory>> catalog = new ArrayList<>();
        catalog.add(book);
        catalog.add(shirt);
        catalog.add(gadget);

        applyDiscount(book, 10);
        applyDiscount(gadget, 15);

        for (Product<? extends ProductCategory> product : catalog) {
            System.out.println(product);
        }
    }

    private static <T extends Product<? extends ProductCategory>> void applyDiscount(T product, double percentage) {
        product.applyDiscount(percentage);
    }

    private abstract static class ProductCategory {
        private final String name;

        ProductCategory(String name) {
            this.name = name;
        }

        String name() {
            return name;
        }
    }

    private static final class BookCategory extends ProductCategory {
        BookCategory(String name) {
            super(name);
        }
    }

    private static final class ClothingCategory extends ProductCategory {
        ClothingCategory(String name) {
            super(name);
        }
    }

    private static final class GadgetCategory extends ProductCategory {
        GadgetCategory(String name) {
            super(name);
        }
    }

    private static final class Product<T extends ProductCategory> {
        private final String name;
        private final T category;
        private double price;

        Product(String name, T category, double price) {
            this.name = name;
            this.category = category;
            this.price = price;
        }

        void applyDiscount(double percentage) {
            price -= price * percentage / 100.0;
        }

        @Override
        public String toString() {
            return name + " [" + category.name() + "] -> " + price;
        }
    }
}
