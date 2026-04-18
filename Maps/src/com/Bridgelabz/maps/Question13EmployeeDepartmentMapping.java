package com.Bridgelabz.maps;

import java.util.*;

public class Question13EmployeeDepartmentMapping {
    public static void main(String[] args) {
        Map<Integer, String> employeeDepartments = new TreeMap<>();
        employeeDepartments.put(101, "Engineering");
        employeeDepartments.put(102, "Finance");
        employeeDepartments.put(103, "Engineering");
        employeeDepartments.put(104, "HR");
        employeeDepartments.put(105, "Sales");

        employeeDepartments.put(104, "Operations");

        System.out.println("Employee -> Department: " + employeeDepartments);
        System.out.println("Employees in Engineering:");
        for (Map.Entry<Integer, String> entry : employeeDepartments.entrySet()) {
            if (entry.getValue().equalsIgnoreCase("Engineering")) {
                System.out.println(entry.getKey());
            }
        }

        Map<String, Integer> totals = new TreeMap<>();
        for (String department : employeeDepartments.values()) {
            totals.put(department, totals.getOrDefault(department, 0) + 1);
        }

        System.out.println("Total employees per department: " + totals);
    }
}
