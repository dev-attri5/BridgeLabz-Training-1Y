
package com.bridgelabz.instanceclass;
public class InstanceMain {
    public static void main(String[] args) {
        Product p1 = new Product("Pen", 10);
        Product p2 = new Product("Book", 50);
        p1.display();
        p2.display();
        Product.showTotal();
    }
}
