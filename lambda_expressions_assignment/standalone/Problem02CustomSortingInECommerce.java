import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Problem02CustomSortingInECommerce {
    static class Product {
        private final String name;
        private final double price;
        private final double rating;
        private final int discountPercent;

        Product(String name, double price, double rating, int discountPercent) {
            this.name = name;
            this.price = price;
            this.rating = rating;
            this.discountPercent = discountPercent;
        }

        public double getPrice() {
            return price;
        }

        public double getRating() {
            return rating;
        }

        public int getDiscountPercent() {
            return discountPercent;
        }

        @Override
        public String toString() {
            return name + " [price=" + price + ", rating=" + rating + ", discount=" + discountPercent + "%]";
        }
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>(Arrays.asList(
            new Product("Bluetooth Speaker", 2499.0, 4.3, 10),
            new Product("Gaming Mouse", 1599.0, 4.7, 25),
            new Product("Laptop Stand", 899.0, 4.1, 15),
            new Product("Mechanical Keyboard", 3499.0, 4.8, 20)
        ));

        sortAndPrint(products, "Sort by price", (first, second) -> Double.compare(first.getPrice(), second.getPrice()));
        sortAndPrint(products, "Sort by rating", (first, second) -> Double.compare(second.getRating(), first.getRating()));
        sortAndPrint(products, "Sort by discount", (first, second) -> Integer.compare(second.getDiscountPercent(), first.getDiscountPercent()));
    }

    private static void sortAndPrint(List<Product> products, String label, Comparator<Product> comparator) {
        List<Product> sortedProducts = new ArrayList<>(products);
        sortedProducts.sort(comparator);

        System.out.println(label + ":");
        for (Product product : sortedProducts) {
            System.out.println(product);
        }
        System.out.println();
    }
}
