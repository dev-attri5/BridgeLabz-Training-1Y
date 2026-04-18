package com.Bridgelabz.maps;

import java.util.*;

public class Question04LibraryCatalog {
    public static void main(String[] args) {
        Map<String, String> catalog = new TreeMap<>();
        catalog.put("978-0134685991", "Effective Java");
        catalog.put("978-0596009205", "Head First Java");
        catalog.put("978-1617294945", "Java Concurrency in Practice");
        catalog.put("978-1801810556", "Java Coding Problems");

        String isbn = "978-0596009205";
        System.out.println("Search by ISBN: " + isbn);
        System.out.println("Result: " + catalog.getOrDefault(isbn, "Book not found"));

        catalog.remove("978-1801810556");
        System.out.println("Catalog sorted by ISBN: " + catalog);

        String titleToSearch = "Effective Java";
        String foundIsbn = "No matching title found";
        for (Map.Entry<String, String> entry : catalog.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(titleToSearch)) {
                foundIsbn = entry.getKey();
                break;
            }
        }
        System.out.println("Reverse search by title \"" + titleToSearch + "\": " + foundIsbn);
    }
}
