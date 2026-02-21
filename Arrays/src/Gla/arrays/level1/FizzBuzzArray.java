package Gla.arrays.level1;

import java.util.Scanner;

public class FizzBuzzArray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a positive number: ");
            int n = sc.nextInt();

            if (n <= 0) {
                System.out.println("Invalid input");
                return;
            }

            String[] arr = new String[n + 1];

            for (int i = 1; i <= n; i++) {
                if (i % 3 == 0 && i % 5 == 0)
                    arr[i] = "FizzBuzz";
                else if (i % 3 == 0)
                    arr[i] = "Fizz";
                else if (i % 5 == 0)
                    arr[i] = "Buzz";
                else
                    arr[i] = String.valueOf(i);
            }

            for (int i = 1; i <= n; i++) {
                System.out.println("Position " + i + " = " + arr[i]);
            }
        }
    }
}