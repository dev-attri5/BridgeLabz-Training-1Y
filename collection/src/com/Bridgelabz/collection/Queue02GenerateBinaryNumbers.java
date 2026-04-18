package com.Bridgelabz.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Queue02GenerateBinaryNumbers {
    public static void main(String[] args) {
        System.out.println(generate(5));
    }

    private static List<String> generate(int n) {
        List<String> result = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();
        queue.add("1");

        for (int index = 0; index < n; index++) {
            String current = queue.remove();
            result.add(current);
            queue.add(current + "0");
            queue.add(current + "1");
        }

        return result;
    }
}
