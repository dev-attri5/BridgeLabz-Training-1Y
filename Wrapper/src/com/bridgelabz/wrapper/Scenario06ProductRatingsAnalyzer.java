package com.bridgelabz.wrapper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Scenario06ProductRatingsAnalyzer {
    public static void main(String[] args) {
        int[] oldRatings = {5, 4, 3};
        ArrayList<Integer> migratedRatings = new ArrayList<>(Arrays.asList(5, null, 4, 2, null));
        ArrayList<Integer> mergedRatings = new ArrayList<>();

        for (int rating : oldRatings) {
            mergedRatings.add(rating);
        }
        for (Integer rating : migratedRatings) {
            if (Objects.nonNull(rating)) {
                mergedRatings.add(rating);
            }
        }

        double total = 0.0;
        for (Integer rating : mergedRatings) {
            total += rating;
        }

        System.out.println("Merged ratings: " + mergedRatings);
        System.out.println("Average rating: " + (total / mergedRatings.size()));
    }
}
