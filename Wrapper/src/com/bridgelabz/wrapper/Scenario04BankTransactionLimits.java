package com.bridgelabz.wrapper;

public class Scenario04BankTransactionLimits {
    public static void main(String[] args) {
        System.out.println("Remaining limit from Double object: " + remainingLimit(Double.valueOf(5000.0), 1750.0));
        System.out.println("Remaining limit from primitive double: " + remainingLimit(2500.0, 800.0));
        System.out.println("Remaining limit when limit is null: " + remainingLimit((Double) null, 200.0));
    }

    public static double remainingLimit(Double dailyLimit, double amountUsed) {
        if (dailyLimit == null) {
            return 0.0;
        }
        return Math.max(0.0, dailyLimit - amountUsed);
    }

    public static double remainingLimit(double dailyLimit, double amountUsed) {
        return remainingLimit(Double.valueOf(dailyLimit), amountUsed);
    }
}
