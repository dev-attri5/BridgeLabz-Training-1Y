package com.Bridgelabz.Generics;
import java.util.*;
public class GenericProblem03CompareValues {
    public static void main(String[] args) {
        System.out.println("10 and 10 equal? " + isEqual(10, 10));
        System.out.println("\"Java\" and \"java\" equal? " + isEqual("Java", "java"));
        System.out.println("3.14 and 3.14 equal? " + isEqual(3.14, 3.14));
    }

    private static <T> boolean isEqual(T a, T b) {
        return a == null ? b == null : a.equals(b);
    }
}
