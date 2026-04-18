package com.Bridgelabz.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;



public class List01ReverseList {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));

        reverse(arrayList);
        reverse(linkedList);

        System.out.println("Reversed ArrayList: " + arrayList);
        System.out.println("Reversed LinkedList: " + linkedList);
    }

    private static <T> void reverse(List<T> list) {
        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            T temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
    }
}
