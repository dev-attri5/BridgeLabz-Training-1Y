package com.bridgelabz.wrapper;

import java.util.ArrayList;
import java.util.Collections;

public class Wrapper07WrapperObjectsInCollections {
    public static void main(String[] args) {
        double[] prices = {10.5, 20.0, 35.75, 5.5};
        ArrayList<Double> priceList = new ArrayList<>();

        for (double price : prices) {
            priceList.add(price);
        }

        double total = 0.0;
        for (Double price : priceList) {
            total += price;
        }

        System.out.println("Wrapped prices: " + priceList);
        System.out.println("Highest price: " + Collections.max(priceList));
        System.out.println("Average price: " + (total / priceList.size()));
    }
}
