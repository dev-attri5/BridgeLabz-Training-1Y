package com.Bridgelabz.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Scenario11LibraryManagementSystem {
    public static void main(String[] args) {
        List<String> books = Arrays.asList("Clean Code", "Effective Java", "Head First Java");
        Set<String> members = new HashSet<>(Arrays.asList("M1", "M2", "M1"));
        Queue<String> issueQueue = new LinkedList<>(books);
        Stack<String> returnedBooks = new Stack<>();

        String issued = issueQueue.remove();
        returnedBooks.push(issued);

        System.out.println("Books: " + books);
        System.out.println("Unique members: " + members);
        System.out.println("Re-issued recent return: " + returnedBooks.pop());
    }
}
