package com.bridgelabz.ExceptionHandling;

public class Problem4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int index = 5;

        try {
            System.out.println("Value at index " + index + ": " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        }
    }
}