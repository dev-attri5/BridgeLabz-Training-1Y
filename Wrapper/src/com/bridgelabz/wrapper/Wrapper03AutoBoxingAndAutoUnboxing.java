package com.bridgelabz.wrapper;

import java.util.ArrayList;

public class Wrapper03AutoBoxingAndAutoUnboxing {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(5);

        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }

        System.out.println("Numbers: " + numbers);
        System.out.println("Sum of numbers = " + sum);
    }
}
