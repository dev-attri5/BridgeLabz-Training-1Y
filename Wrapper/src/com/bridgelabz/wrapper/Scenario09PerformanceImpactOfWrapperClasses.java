package com.bridgelabz.wrapper;

import java.util.ArrayList;

public class Scenario09PerformanceImpactOfWrapperClasses {
    public static void main(String[] args) {
        final int size = 1_000_000;

        long startArrayFill = System.nanoTime();
        int[] primitiveArray = new int[size];
        for (int index = 0; index < size; index++) {
            primitiveArray[index] = index;
        }
        long endArrayFill = System.nanoTime();

        long startListFill = System.nanoTime();
        ArrayList<Integer> wrapperList = new ArrayList<>(size);
        for (int index = 0; index < size; index++) {
            wrapperList.add(index);
        }
        long endListFill = System.nanoTime();

        long startArraySum = System.nanoTime();
        long primitiveSum = 0;
        for (int value : primitiveArray) {
            primitiveSum += value;
        }
        long endArraySum = System.nanoTime();

        long startListSum = System.nanoTime();
        long wrapperSum = 0;
        for (Integer value : wrapperList) {
            wrapperSum += value;
        }
        long endListSum = System.nanoTime();

        System.out.println("int[] fill time (ns): " + (endArrayFill - startArrayFill));
        System.out.println("ArrayList<Integer> fill time (ns): " + (endListFill - startListFill));
        System.out.println("int[] sum time (ns): " + (endArraySum - startArraySum));
        System.out.println("ArrayList<Integer> sum time (ns): " + (endListSum - startListSum));
        System.out.println("Primitive sum: " + primitiveSum);
        System.out.println("Wrapper sum: " + wrapperSum);
    }
}
