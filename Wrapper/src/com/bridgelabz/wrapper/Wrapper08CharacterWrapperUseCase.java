package com.bridgelabz.wrapper;

public class Wrapper08CharacterWrapperUseCase {
    public static void main(String[] args) {
        String input = "Java 17 Rocks! #2026";
        int letters = 0;
        int digits = 0;
        int specialCharacters = 0;

        for (char current : input.toCharArray()) {
            if (Character.isLetter(current)) {
                letters++;
            } else if (Character.isDigit(current)) {
                digits++;
            } else if (!Character.isWhitespace(current)) {
                specialCharacters++;
            }
        }

        System.out.println("Input: " + input);
        System.out.println("Total letters: " + letters);
        System.out.println("Total digits: " + digits);
        System.out.println("Total special characters: " + specialCharacters);
    }
}
