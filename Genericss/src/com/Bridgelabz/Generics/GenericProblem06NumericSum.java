package com.Bridgelabz.Generics;

import java.util.List;

public class GenericProblem06NumericSum {
    public static void main(String[] args) {
        List<Integer> integers = List.of(10, 20, 30, 40);
        List<Double> doubles = List.of(2.5, 3.5, 4.0);

        System.out.println("Sum of integers: " + sumNumbers(integers));
        System.out.println("Sum of doubles: " + sumNumbers(doubles));
    }

    private static double sumNumbers(List<? extends Number> list) {
        double sum = 0.0;
        for (Number number : list) {
            sum += number.doubleValue();
        }
        return sum;
    }
}
