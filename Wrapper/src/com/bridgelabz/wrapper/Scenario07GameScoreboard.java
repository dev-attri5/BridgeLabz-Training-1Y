package com.bridgelabz.wrapper;

public class Scenario07GameScoreboard {
    public static void main(String[] args) {
        Integer[] scores = {150, null, 90, 110, null, 200};
        int notPlayed = 0;
        int total = 0;

        for (Integer score : scores) {
            if (score == null) {
                notPlayed++;
            } else {
                total += score;
            }
        }

        System.out.println("Players who have not played: " + notPlayed);
        System.out.println("Total of valid scores: " + total);
    }
}
