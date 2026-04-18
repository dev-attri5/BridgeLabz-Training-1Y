package com.Bridgelabz.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Scenario02OnlineExaminationManagement {
    public static void main(String[] args) {
        List<String> questions = new ArrayList<>(Arrays.asList("Java", "Collections", "Queue", "Set"));
        Collections.shuffle(questions);

        Set<String> studentIds = new HashSet<>(Arrays.asList("S101", "S102", "S101", "S103"));
        Queue<String> waitingStudents = new LinkedList<>(Arrays.asList("Aarav", "Diya", "Kabir"));
        Stack<String> navigation = new Stack<>();

        navigation.push(questions.get(0));
        navigation.push(questions.get(1));

        System.out.println("Unique students: " + studentIds);
        System.out.println("Questions: " + questions);
        System.out.println("Serving student: " + waitingStudents.remove());
        System.out.println("Previous question: " + navigation.pop());
    }
}
