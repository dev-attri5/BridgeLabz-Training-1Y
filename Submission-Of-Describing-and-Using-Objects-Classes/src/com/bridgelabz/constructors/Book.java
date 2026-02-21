
package com.bridgelabz.constructors;
public class Book {
    String title, author;
    double price;

    public Book() {
        this("Unknown", "Unknown", 0);
    }

    public Book(String t, String a, double p) {
        title = t; author = a; price = p;
    }

    public void display() {
        System.out.println(title + " " + author + " " + price);
    }
}
