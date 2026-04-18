package com.Bridgelabz.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class Scenario05OnlineGamingTournamentTracker {
    public static void main(String[] args) {
        Set<String> players = new LinkedHashSet<>(Arrays.asList("Aarav", "Diya", "Kabir"));
        Queue<String> matches = new LinkedList<>(Arrays.asList("Aarav vs Diya", "Kabir vs Aarav"));
        List<String> results = new ArrayList<>();
        TreeSet<Score> leaderboard = new TreeSet<>();

        while (!matches.isEmpty()) {
            String match = matches.remove();
            results.add(match + " -> completed");
        }

        leaderboard.add(new Score("Aarav", 4));
        leaderboard.add(new Score("Kabir", 3));
        leaderboard.add(new Score("Diya", 1));

        System.out.println("Players: " + players);
        System.out.println("Results: " + results);
        System.out.println("Leaderboard: " + leaderboard);
    }

    private static final class Score implements Comparable<Score> {
        private final String name;
        private final int points;

        private Score(String name, int points) {
            this.name = name;
            this.points = points;
        }

        @Override
        public int compareTo(Score other) {
            int pointCompare = Integer.compare(other.points, points);
            return pointCompare != 0 ? pointCompare : name.compareTo(other.name);
        }

        @Override
        public String toString() {
            return name + "=" + points;
        }
    }
}
