package com.bridgelabz.wrapper;

import java.util.Arrays;
import java.util.List;

public class Wrapper06InputConversionUtility {
    public static void main(String[] args) {
        List<String> inputs = Arrays.asList("123", "abc", "45.6", "0");
        for (String input : inputs) {
            System.out.println("safeParseInt(\"" + input + "\") = " + safeParseInt(input));
        }
    }

    public static int safeParseInt(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException exception) {
            return -1;
        }
    }
}
