package com.Bridgelabz.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class List04RemoveDuplicatesPreserveOrder {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(3, 1, 2, 2, 3, 4);
        List<Integer> output = new ArrayList<>(new LinkedHashSet<>(input));

        System.out.println("Original: " + input);
        System.out.println("Without duplicates: " + output);
    }
}
