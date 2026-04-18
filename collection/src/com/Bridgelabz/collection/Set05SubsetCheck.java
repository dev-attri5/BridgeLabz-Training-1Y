package com.Bridgelabz.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Set05SubsetCheck {
    public static void main(String[] args) {
        Set<Integer> small = new HashSet<>(Arrays.asList(2, 3));
        Set<Integer> large = new HashSet<>(Arrays.asList(1, 2, 3, 4));

        System.out.println("Set1: " + small);
        System.out.println("Set2: " + large);
        System.out.println("Is subset: " + large.containsAll(small));
    }
}
