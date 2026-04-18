package com.Bridgelabz.collection;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Scenario14CustomerFeedbackAnalysis {
    public static void main(String[] args) {
        List<String> feedbacks = Arrays.asList(
                "Good delivery",
                "Great support",
                "Good delivery",
                "App is easy to use"
        );
        Set<String> uniqueFeedbacks = new LinkedHashSet<>(feedbacks);
        Queue<String> queue = new LinkedList<>(uniqueFeedbacks);
        Stack<String> recent = new Stack<>();

        while (!queue.isEmpty()) {
            String feedback = queue.remove();
            recent.push(feedback);
            System.out.println("Processed: " + feedback);
        }

        System.out.println("Recent feedbacks: " + recent);
    }
}
