
package com.bridgelabz.ecommerce;
public abstract class Product{
protected double price;
public Product(double price){this.price=price;}
public abstract double discount();
public void finalPrice(){System.out.println(price-discount());}
}
