package com.bridgelabz.wrapper;

import java.util.Arrays;
import java.util.List;

public class Scenario03UserInputValidation {
    public static void main(String[] args) {
        List<String> inputs = Arrays.asList("21", "17", "abc", "18");
        for (String input : inputs) {
            System.out.println("Input \"" + input + "\" valid: " + isValidAdultAge(input));
        }
    }

    public static boolean isValidAdultAge(String input) {
        try {
            return Integer.parseInt(input) >= 18;
        } catch (NumberFormatException exception) {
            return false;
        }
    }
}
