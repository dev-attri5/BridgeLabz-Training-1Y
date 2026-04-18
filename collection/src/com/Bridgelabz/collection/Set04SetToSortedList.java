package com.Bridgelabz.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Set04SetToSortedList {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>(Arrays.asList(5, 3, 9, 1));
        List<Integer> sorted = new ArrayList<>(numbers);
        sorted.sort(Integer::compareTo);

        System.out.println("Input set: " + numbers);
        System.out.println("Sorted list: " + sorted);
    }
}
