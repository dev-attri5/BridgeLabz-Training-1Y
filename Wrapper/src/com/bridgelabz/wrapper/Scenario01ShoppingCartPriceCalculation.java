package com.bridgelabz.wrapper;

public class Scenario01ShoppingCartPriceCalculation {
    public static void main(String[] args) {
        String[] prices = {"250", "499", "99", "abc", "150"};
        int total = 0;

        for (String price : prices) {
            try {
                total += Integer.parseInt(price);
            } catch (NumberFormatException exception) {
                System.out.println("Skipping invalid price: " + price);
            }
        }

        System.out.println("Total price: " + total);
    }
}
