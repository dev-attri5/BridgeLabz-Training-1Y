package com.bridgelabz.wrapper;

import java.util.ArrayList;

public class Scenario08StudentMarksReport {
    public static void main(String[] args) {
        Object[] inputs = {"85", 95, Integer.valueOf(88), "null", "abc", "72"};
        ArrayList<Integer> validMarks = new ArrayList<>();

        for (Object input : inputs) {
            Integer parsed = parseMark(input);
            if (parsed != null) {
                validMarks.add(parsed);
            }
        }

        int total = 0;
        for (Integer mark : validMarks) {
            total += mark;
        }

        System.out.println("Valid marks: " + validMarks);
        System.out.println("Average marks: " + ((double) total / validMarks.size()));
    }

    private static Integer parseMark(Object input) {
        if (input == null) {
            return null;
        }
        if (input instanceof Integer integerValue) {
            return integerValue;
        }
        if (input instanceof String stringValue) {
            if ("null".equalsIgnoreCase(stringValue)) {
                return null;
            }
            try {
                return Integer.parseInt(stringValue);
            } catch (NumberFormatException exception) {
                return null;
            }
        }
        return null;
    }
}
