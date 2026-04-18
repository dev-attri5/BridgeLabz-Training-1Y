package com.Bridgelabz.Generics;

import java.util.*;

public class GenericProblem07CopyListElements {
    public static void main(String[] args) {
        List<Number> destination = new ArrayList<>(List.of(100, 200));
        List<Integer> sourceIntegers = List.of(1, 2, 3, 4);
        List<Double> sourceDoubles = List.of(5.5, 6.6);

        copyList(destination, sourceIntegers);
        copyList(destination, sourceDoubles);

        System.out.println("Destination after copy: " + destination);
    }

    private static void copyList(List<? super Number> dest, List<? extends Number> src) {
        dest.addAll(src);
    }
}
