package Gla.BuiltInFunctionPracticeProblem.level2;

import java.util.*;

public class NumberGuessingGame {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int low = 1, high = 100;
        while (true) {
            int guess = (low + high) / 2;
            System.out.println("Is your number " + guess + "? (high/low/correct)");
            String feedback = sc.next();

            if (feedback.equalsIgnoreCase("correct")) break;
            else if (feedback.equalsIgnoreCase("high")) high = guess - 1;
            else low = guess + 1;
        }
        System.out.println("Guessed successfully!");
    }
}
