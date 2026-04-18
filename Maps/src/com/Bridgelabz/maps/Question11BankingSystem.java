package com.Bridgelabz.maps;

import java.util.*;

public class Question11BankingSystem {
    public static void main(String[] args) {
        Map<String, Double> balances = new TreeMap<>();
        balances.put("AC1001", 50000.0);
        balances.put("AC1002", 82000.0);
        balances.put("AC1003", 15000.0);
        balances.put("AC1004", 110000.0);
        balances.put("AC1005", 76000.0);

        deposit(balances, "AC1003", 8000);
        withdraw(balances, "AC1002", 15000);
        withdraw(balances, "AC1001", 70000);
        deposit(balances, "AC1005", 12000);

        List<Map.Entry<String, Double>> customers = new ArrayList<>(balances.entrySet());
        customers.sort(Map.Entry.<String, Double>comparingByValue(Comparator.reverseOrder()));

        System.out.println("Customers sorted by descending balance:");
        for (Map.Entry<String, Double> entry : customers) {
            System.out.printf(Locale.US, "%s -> %.2f%n", entry.getKey(), entry.getValue());
        }

        System.out.println("Top 3 customers:");
        for (int i = 0; i < 3 && i < customers.size(); i++) {
            Map.Entry<String, Double> entry = customers.get(i);
            System.out.printf(Locale.US, "%s -> %.2f%n", entry.getKey(), entry.getValue());
        }
    }

    private static void deposit(Map<String, Double> balances, String account, double amount) {
        balances.put(account, balances.getOrDefault(account, 0.0) + amount);
    }

    private static void withdraw(Map<String, Double> balances, String account, double amount) {
        if (!balances.containsKey(account)) {
            System.out.println("Account not found: " + account);
            return;
        }

        double current = balances.get(account);
        if (amount > current) {
            System.out.printf(Locale.US, "Withdrawal denied for %s: amount %.2f exceeds balance %.2f%n",
                    account, amount, current);
            return;
        }

        balances.put(account, current - amount);
    }
}
