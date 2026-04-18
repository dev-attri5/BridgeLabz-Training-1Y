package com.Bridgelabz.Generics;
import java.util.*;
public class GenericProblem04MaximumOfThree {
    public static void main(String[] args) {
        System.out.println("Maximum integer: " + maximum(10, 45, 23));
        System.out.println("Maximum double: " + maximum(10.5, 45.2, 23.9));
        System.out.println("Maximum string: " + maximum("apple", "mango", "banana"));
    }

    private static <T extends Comparable<? super T>> T maximum(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }
}
