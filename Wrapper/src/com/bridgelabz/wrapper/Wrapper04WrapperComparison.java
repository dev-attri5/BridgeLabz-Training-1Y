package com.bridgelabz.wrapper;

public class Wrapper04WrapperComparison {
    public static void main(String[] args) {
        Integer a = 100;
        Integer b = 100;
        Integer c = 200;
        Integer d = 200;

        System.out.println("a == b: " + (a == b));
        System.out.println("c == d: " + (c == d));
        System.out.println("a.equals(b): " + a.equals(b));
        System.out.println("100 is cached by Integer, so a and b often share the same reference.");
        System.out.println("200 is usually outside the cache, so c and d are different objects.");
    }
}
