package Gla.arrays.level1;

import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        for (int n : arr) {
            if (n > 0) {
                System.out.println(n + " is positive and " + (n % 2 == 0 ? "even" : "odd"));
            } else if (n < 0) {
                System.out.println(n + " is negative");
            } else {
                System.out.println("Number is zero");
            }
        }

        if (arr[0] == arr[arr.length - 1])
            System.out.println("First and last elements are equal");
        else if (arr[0] > arr[arr.length - 1])
            System.out.println("First element is greater");
        else
            System.out.println("Last element is greater");

        sc.close();
    }
}