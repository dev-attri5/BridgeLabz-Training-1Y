import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Problem09OnlineCourseEnrollmentSystem {
    public static void main(String[] args) throws Exception {
        Class.forName("org.sqlite.JDBC");
        Path database = Path.of(System.getProperty("java.io.tmpdir"), "jdbc_assignment", "problem09_online_course_enrollment_system.db");
        Files.createDirectories(database.getParent());
        Files.deleteIfExists(database);

        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:" + database)) {
            try (Statement statement = connection.createStatement()) {
                statement.execute("CREATE TABLE enrollments(id INT PRIMARY KEY, student VARCHAR(50), course VARCHAR(50))");
            }

            executeUpdate(connection, "INSERT INTO enrollments VALUES (?, ?, ?)", 1, "Pooja", "Java");
            executeUpdate(connection, "INSERT INTO enrollments VALUES (?, ?, ?)", 2, "Arun", "Python");
            executeUpdate(connection, "INSERT INTO enrollments VALUES (?, ?, ?)", 3, "Leela", "Java");

            printQuery(connection, "SELECT * FROM enrollments WHERE course = ?", new Object[]{"Java"}, "id", "student", "course");
            executeUpdate(connection, "UPDATE enrollments SET course = ? WHERE id = ?", "Data Science", 2);
            executeUpdate(connection, "DELETE FROM enrollments WHERE id = ?", 3);
            printQuery(connection, "SELECT * FROM enrollments", new Object[0], "id", "student", "course");
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

    private static void printQuery(Connection connection, String sql, Object[] params, String... columns) throws Exception {
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            for (int i = 0; i < params.length; i++) {
                statement.setObject(i + 1, params[i]);
            }
            try (ResultSet resultSet = statement.executeQuery()) {
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
        }
        System.out.println();
    }
}
