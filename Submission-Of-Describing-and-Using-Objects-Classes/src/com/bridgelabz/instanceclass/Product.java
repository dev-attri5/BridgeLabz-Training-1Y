
package com.bridgelabz.instanceclass;
public class Product {
    String name;
    double price;
    static int totalProducts = 0;

    public Product(String n, double p) {
        name = n; price = p;
        totalProducts++;
    }

    public void display() {
        System.out.println(name + " " + price);
    }

    public static void showTotal() {
        System.out.println("Total Products = " + totalProducts);
    }
}
