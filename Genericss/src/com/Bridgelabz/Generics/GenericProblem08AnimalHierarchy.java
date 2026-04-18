package com.Bridgelabz.Generics;

import java.util.List;

public class GenericProblem08AnimalHierarchy {
    public static void main(String[] args) {
        printAnimals(List.of(new Dog("Bruno"), new Dog("Tiger")));
        printAnimals(List.of(new Cat("Misty"), new Cat("Luna")));
    }

    private static void printAnimals(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            System.out.println(animal.describe());
        }
    }

    private static class Animal {
        private final String name;

        Animal(String name) {
            this.name = name;
        }

        String describe() {
            return "Animal: " + name;
        }
    }

    private static final class Dog extends Animal {
        Dog(String name) {
            super(name);
        }

        @Override
        String describe() {
            return "Dog: " + super.describe().replace("Animal: ", "");
        }
    }

    private static final class Cat extends Animal {
        Cat(String name) {
            super(name);
        }

        @Override
        String describe() {
            return "Cat: " + super.describe().replace("Animal: ", "");
        }
    }
}
