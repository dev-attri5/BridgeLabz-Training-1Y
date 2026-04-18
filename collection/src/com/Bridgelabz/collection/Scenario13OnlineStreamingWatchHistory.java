package com.Bridgelabz.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Scenario13OnlineStreamingWatchHistory {
    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
                new Movie("Interstellar", "Sci-Fi"),
                new Movie("Zindagi Na Milegi Dobara", "Drama"),
                new Movie("The Martian", "Sci-Fi")
        );
        Queue<Movie> upNext = new LinkedList<>(movies);
        Stack<Movie> history = new Stack<>();
        Set<String> genres = new HashSet<>();

        while (!upNext.isEmpty()) {
            Movie movie = upNext.remove();
            history.push(movie);
            genres.add(movie.genre);
        }

        List<Movie> recommendations = new ArrayList<>();
        for (Movie movie : movies) {
            if (genres.contains(movie.genre)) {
                recommendations.add(movie);
            }
        }

        System.out.println("History: " + history);
        System.out.println("Genres watched: " + genres);
        System.out.println("Recommendations: " + recommendations);
    }

    private static final class Movie {
        private final String title;
        private final String genre;

        private Movie(String title, String genre) {
            this.title = title;
            this.genre = genre;
        }

        @Override
        public String toString() {
            return title + " (" + genre + ")";
        }
    }
}
