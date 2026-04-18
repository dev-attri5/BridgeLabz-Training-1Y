package com.Bridgelabz.maps;

import java.util.*;

public class WarmUp06GroupObjectsByProperty {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Carol", "HR"),
                new Employee("David", "Finance"),
                new Employee("Esha", "IT")
        );

        Map<String, List<String>> grouped = new TreeMap<>();
        for (Employee employee : employees) {
            grouped.computeIfAbsent(employee.department, key -> new ArrayList<>()).add(employee.name);
        }

        System.out.println("Employees grouped by department: " + grouped);
    }

    static class Employee {
        String name;
        String department;

        Employee(String name, String department) {
            this.name = name;
            this.department = department;
        }
    }
}
