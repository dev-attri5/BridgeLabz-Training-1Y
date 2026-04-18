package com.Bridgelabz.Generics;
import java.util.*;
public class GenericProblem01Box {
    public static void main(String[] args) {
        Box<Integer> numberBox = new Box<>();
        numberBox.set(42);
        System.out.println("Integer box: " + numberBox.get());

        Box<String> textBox = new Box<>();
        textBox.set("Amol");
        System.out.println("String box: " + textBox.get());

        Box<Double> decimalBox = new Box<>();
        decimalBox.set(98.75);
        System.out.println("Double box: " + decimalBox.get());
    }

    private static final class Box<T> {
        private T value;

        void set(T value) {
            this.value = value;
        }

        T get() {
            return value;
        }
    }
}
