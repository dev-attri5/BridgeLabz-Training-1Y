
package com.bridgelabz.constructors;
public class ConstructorsMain {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Java", "James", 500);
        b1.display();
        b2.display();
    }
}
