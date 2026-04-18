package com.Bridgelabz.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Set03SymmetricDifference {
    public static void main(String[] args) {
        Set<Integer> set1 = new LinkedHashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new LinkedHashSet<>(Arrays.asList(3, 4, 5));

        Set<Integer> result = new LinkedHashSet<>(set1);
        result.addAll(set2);

        Set<Integer> common = new HashSet<>(set1);
        common.retainAll(set2);
        result.removeAll(common);

        System.out.println("Symmetric difference: " + result);
    }
}
