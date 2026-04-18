package com.Bridgelabz.maps;

import java.util.*;

public class Question03VotingCount {
    public static void main(String[] args) {
        List<String> votes = List.of(
                "Riya", "Kabir", "Riya", "Anaya", "Kabir",
                "Riya", "Anaya", "Kabir", "Kabir", "Riya"
        );

        Map<String, Integer> voteCount = new TreeMap<>();
        for (String vote : votes) {
            voteCount.put(vote, voteCount.getOrDefault(vote, 0) + 1);
        }

        String winner = "";
        int maxVotes = -1;
        for (Map.Entry<String, Integer> entry : voteCount.entrySet()) {
            if (entry.getValue() > maxVotes) {
                maxVotes = entry.getValue();
                winner = entry.getKey();
            }
        }

        System.out.println("Votes: " + voteCount);
        System.out.println("Winner: " + winner + " with " + maxVotes + " votes");
    }
}
