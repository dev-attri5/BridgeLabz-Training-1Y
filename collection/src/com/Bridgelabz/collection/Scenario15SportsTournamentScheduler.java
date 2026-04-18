package com.Bridgelabz.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class Scenario15SportsTournamentScheduler {
    public static void main(String[] args) {
        Set<Team> teams = new LinkedHashSet<>(Arrays.asList(
                new Team("Lions", 0),
                new Team("Tigers", 0),
                new Team("Eagles", 0)
        ));
        Queue<String> matches = new LinkedList<>(Arrays.asList("Lions vs Tigers", "Eagles vs Lions"));
        List<String> results = new ArrayList<>();
        TreeSet<Team> leaderboard = new TreeSet<>(Comparator.comparingInt(Team::getPoints).reversed().thenComparing(Team::getName));

        while (!matches.isEmpty()) {
            results.add(matches.remove() + " -> completed");
        }

        leaderboard.add(new Team("Lions", 6));
        leaderboard.add(new Team("Eagles", 4));
        leaderboard.add(new Team("Tigers", 3));

        System.out.println("Registered teams: " + teams);
        System.out.println("Results: " + results);
        System.out.println("Leaderboard: " + leaderboard);
    }

    private static final class Team {
        private final String name;
        private final int points;

        private Team(String name, int points) {
            this.name = name;
            this.points = points;
        }

        private String getName() {
            return name;
        }

        private int getPoints() {
            return points;
        }

        @Override
        public String toString() {
            return name + "=" + points;
        }
    }
}
