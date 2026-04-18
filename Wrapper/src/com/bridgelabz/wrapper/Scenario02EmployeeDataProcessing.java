package com.bridgelabz.wrapper;

import java.util.ArrayList;
import java.util.Collections;

public class Scenario02EmployeeDataProcessing {
    public static void main(String[] args) {
        int[] ages = {24, 31, 45, 29, 52, 27};
        ArrayList<Integer> ageList = new ArrayList<>();

        for (int age : ages) {
            ageList.add(age);
        }

        System.out.println("Ages as wrapper objects: " + ageList);
        System.out.println("Youngest employee age: " + Collections.min(ageList));
        System.out.println("Oldest employee age: " + Collections.max(ageList));
    }
}
