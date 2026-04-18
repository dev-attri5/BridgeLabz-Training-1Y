package com.Bridgelabz.Generics;
import java.util.*;
public class GenericProblem02Pair {
    public static void main(String[] args) {
        Pair<String, Integer> student = new Pair<>("Amol", 20);
        Pair<String, Double> product = new Pair<>("Headphones", 2499.50);

        System.out.println("Student name: " + student.getFirst());
        System.out.println("Student age: " + student.getSecond());
        System.out.println("Product name: " + product.getFirst());
        System.out.println("Product price: " + product.getSecond());
    }

    private static final class Pair<T, U> {
        private final T first;
        private final U second;

        Pair(T first, U second) {
            this.first = first;
            this.second = second;
        }

        T getFirst() {
            return first;
        }

        U getSecond() {
            return second;
        }
    }
}
