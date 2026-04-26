import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Problem01TopTrendingMovies {
    static class Movie {
        private final String title;
        private final double rating;
        private final int releaseYear;

        Movie(String title, double rating, int releaseYear) {
            this.title = title;
            this.rating = rating;
            this.releaseYear = releaseYear;
        }

        public double getRating() {
            return rating;
        }

        public int getReleaseYear() {
            return releaseYear;
        }

        @Override
        public String toString() {
            return title + " [rating=" + rating + ", year=" + releaseYear + "]";
        }
    }

    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
            new Movie("Sky Frontier", 8.9, 2025),
            new Movie("Ocean Pulse", 9.1, 2024),
            new Movie("Crimson Orbit", 8.7, 2026),
            new Movie("Silent Echo", 8.8, 2023),
            new Movie("Neon Trails", 9.2, 2026),
            new Movie("Hidden Valley", 7.9, 2022),
            new Movie("Quantum Run", 8.9, 2024)
        );

        List<Movie> topFive = movies.stream()
            .filter(movie -> movie.getRating() >= 8.5)
            .sorted(Comparator.comparingDouble(Movie::getRating).reversed()
                .thenComparing(Comparator.comparingInt(Movie::getReleaseYear).reversed()))
            .limit(5)
            .collect(Collectors.toList());

        topFive.forEach(System.out::println);
    }
}
