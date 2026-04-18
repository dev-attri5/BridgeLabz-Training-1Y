package com.Bridgelabz.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List03RotateList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        int positions = 2;

        System.out.println("Original: " + numbers);
        System.out.println("Rotated: " + rotateLeft(numbers, positions));
    }

    private static <T> List<T> rotateLeft(List<T> list, int positions) {
        List<T> rotated = new ArrayList<>();
        int shift = positions % list.size();

        for (int index = shift; index < list.size(); index++) {
            rotated.add(list.get(index));
        }
        for (int index = 0; index < shift; index++) {
            rotated.add(list.get(index));
        }

        return rotated;
    }
}
