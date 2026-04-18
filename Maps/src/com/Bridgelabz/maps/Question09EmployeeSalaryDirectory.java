package com.Bridgelabz.maps;

import java.util.*;

public class Question09EmployeeSalaryDirectory {
    public static void main(String[] args) {
        Map<String, Double> salaries = new TreeMap<>();
        salaries.put("Alice", 52000.0);
        salaries.put("Bharat", 61000.0);
        salaries.put("Chetna", 61000.0);
        salaries.put("Dev", 58000.0);
        salaries.put("Esha", 72000.0);
        salaries.put("Farhan", 72000.0);

        giveRaise(salaries, "Alice", 10);
        giveRaise(salaries, "Dev", 7.5);
        giveRaise(salaries, "Gauri", 5);

        double total = 0;
        double maxSalary = 0;
        for (double salary : salaries.values()) {
            total += salary;
            if (salary > maxSalary) {
                maxSalary = salary;
            }
        }

        List<String> highestPaid = new ArrayList<>();
        for (Map.Entry<String, Double> entry : salaries.entrySet()) {
            if (entry.getValue() == maxSalary) {
                highestPaid.add(entry.getKey());
            }
        }

        System.out.println("Updated salaries: " + salaries);
        System.out.printf(Locale.US, "Average salary: %.2f%n", total / salaries.size());
        System.out.println("Highest-paid employee(s): " + highestPaid);
    }

    private static void giveRaise(Map<String, Double> salaries, String employee, double percent) {
        if (!salaries.containsKey(employee)) {
            System.out.println("Employee not found: " + employee);
            return;
        }
        double current = salaries.get(employee);
        salaries.put(employee, current + (current * percent / 100.0));
    }
}
