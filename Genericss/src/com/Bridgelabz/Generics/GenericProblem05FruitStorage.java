package com.Bridgelabz.Generics;

import java.util.*;

public class GenericProblem05FruitStorage {
    public static void main(String[] args) {
        FruitBox<Apple> appleBox = new FruitBox<>();
        appleBox.add(new Apple("Kashmir Apple"));
        appleBox.add(new Apple("Green Apple"));
        appleBox.displayFruits();

        FruitBox<Mango> mangoBox = new FruitBox<>();
        mangoBox.add(new Mango("Alphonso"));
        mangoBox.add(new Mango("Kesar"));
        mangoBox.displayFruits();

        System.out.println("Non-fruit objects like Car cannot be added because FruitBox accepts only Fruit types.");
    }

    private static class Fruit {
        private final String name;

        Fruit(String name) {
            this.name = name;
        }

        String name() {
            return name;
        }
    }

    private static final class Apple extends Fruit {
        Apple(String name) {
            super(name);
        }
    }

    private static final class Mango extends Fruit {
        Mango(String name) {
            super(name);
        }
    }

    private static final class FruitBox<T extends Fruit> {
        private final List<T> fruits = new ArrayList<>();

        void add(T fruit) {
            fruits.add(fruit);
        }

        void displayFruits() {
            System.out.println("Stored fruits:");
            for (T fruit : fruits) {
                System.out.println("- " + fruit.name());
            }
        }
    }
}
