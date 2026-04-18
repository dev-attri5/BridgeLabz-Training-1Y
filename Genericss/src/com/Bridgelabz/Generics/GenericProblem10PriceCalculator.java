package com.Bridgelabz.Generics;

import java.util.List;

public class GenericProblem10PriceCalculator {
    public static void main(String[] args) {
        List<Mobile> mobiles = List.of(
                new Mobile("Pixel", 54999),
                new Mobile("Galaxy", 62999));
        List<Laptop> laptops = List.of(
                new Laptop("ThinkPad", 88999),
                new Laptop("MacBook Air", 104999));

        System.out.println("Total mobile price: " + calculateTotal(mobiles));
        System.out.println("Total laptop price: " + calculateTotal(laptops));
    }

    private static double calculateTotal(List<? extends Product> items) {
        double total = 0;
        for (Product item : items) {
            total += item.getPrice();
        }
        return total;
    }

    private abstract static class Product {
        private final String name;
        private final double price;

        Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        double getPrice() {
            return price;
        }

        @Override
        public String toString() {
            return name + " (" + price + ")";
        }
    }

    private static final class Mobile extends Product {
        Mobile(String name, double price) {
            super(name, price);
        }
    }

    private static final class Laptop extends Product {
        Laptop(String name, double price) {
            super(name, price);
        }
    }
}
