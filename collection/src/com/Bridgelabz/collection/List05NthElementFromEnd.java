package com.Bridgelabz.collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class List05NthElementFromEnd {
    public static void main(String[] args) {
        LinkedList<String> values = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));
        int n = 2;

        System.out.println("List: " + values);
        System.out.println("Nth element from end: " + nthFromEnd(values, n));
    }

    private static <T> T nthFromEnd(LinkedList<T> list, int n) {
        Iterator<T> lead = list.iterator();
        Iterator<T> follow = list.iterator();

        for (int index = 0; index < n; index++) {
            lead.next();
        }

        T result = follow.next();
        while (lead.hasNext()) {
            lead.next();
            result = follow.next();
        }

        return result;
    }
}
