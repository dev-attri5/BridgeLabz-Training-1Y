package com.Bridgelabz.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Set01CheckSetEquality {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 2, 1));

        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);
        System.out.println("Equal: " + set1.equals(set2));
    }
}
