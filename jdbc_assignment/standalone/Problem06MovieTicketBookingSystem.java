import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Problem06MovieTicketBookingSystem {
    public static void main(String[] args) throws Exception {
        Class.forName("org.sqlite.JDBC");
        Path database = Path.of(System.getProperty("java.io.tmpdir"), "jdbc_assignment", "problem06_movie_ticket_booking_system.db");
        Files.createDirectories(database.getParent());
        Files.deleteIfExists(database);

        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:" + database)) {
            try (Statement statement = connection.createStatement()) {
                statement.execute("CREATE TABLE movies(id INT PRIMARY KEY, name VARCHAR(50), seats INT)");
            }

            executeUpdate(connection, "INSERT INTO movies VALUES (?, ?, ?)", 1, "Galactic Run", 25);
            executeUpdate(connection, "INSERT INTO movies VALUES (?, ?, ?)", 2, "Mystery Lake", 0);
            executeUpdate(connection, "INSERT INTO movies VALUES (?, ?, ?)", 3, "City Lights", 14);

            printQuery(connection, "SELECT * FROM movies WHERE seats > 0", "id", "name", "seats");
            executeUpdate(connection, "UPDATE movies SET seats = seats - 2 WHERE id = ?", 1);
            executeUpdate(connection, "DELETE FROM movies WHERE id = ?", 2);
            printQuery(connection, "SELECT * FROM movies", "id", "name", "seats");
        }
    }

    private static void executeUpdate(Connection connection, String sql, Object... params) throws Exception {
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            for (int i = 0; i < params.length; i++) {
                statement.setObject(i + 1, params[i]);
            }
            statement.executeUpdate();
        }
    }

    private static void printQuery(Connection connection, String sql, String... columns) throws Exception {
        try (PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                StringBuilder row = new StringBuilder();
                for (String column : columns) {
                    if (!row.isEmpty()) {
                        row.append(", ");
                    }
                    row.append(column).append("=").append(resultSet.getString(column));
                }
                System.out.println(row);
            }
        }
        System.out.println();
    }
}
