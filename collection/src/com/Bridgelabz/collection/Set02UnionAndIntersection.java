package com.Bridgelabz.collection;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Set02UnionAndIntersection {
    public static void main(String[] args) {
        Set<Integer> set1 = new LinkedHashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new LinkedHashSet<>(Arrays.asList(3, 4, 5));

        Set<Integer> union = new LinkedHashSet<>(set1);
        union.addAll(set2);

        Set<Integer> intersection = new LinkedHashSet<>(set1);
        intersection.retainAll(set2);

        System.out.println("Union: " + union);
        System.out.println("Intersection: " + intersection);
    }
}
