import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Problem11GymMembershipDatabase {
    public static void main(String[] args) throws Exception {
        Class.forName("org.sqlite.JDBC");
        Path database = Path.of(System.getProperty("java.io.tmpdir"), "jdbc_assignment", "problem11_gym_membership_database.db");
        Files.createDirectories(database.getParent());
        Files.deleteIfExists(database);

        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:" + database)) {
            try (Statement statement = connection.createStatement()) {
                statement.execute("CREATE TABLE members(id INT PRIMARY KEY, name VARCHAR(50), type VARCHAR(20), months INT)");
            }

            executeUpdate(connection, "INSERT INTO members VALUES (?, ?, ?, ?)", 1, "Ritika", "Premium", 12);
            executeUpdate(connection, "INSERT INTO members VALUES (?, ?, ?, ?)", 2, "Sahil", "Basic", 3);
            executeUpdate(connection, "INSERT INTO members VALUES (?, ?, ?, ?)", 3, "Nora", "Premium", 0);

            printQuery(connection, "SELECT * FROM members WHERE type = 'Premium'", "id", "name", "type", "months");
            executeUpdate(connection, "UPDATE members SET months = months + ? WHERE id = ?", 6, 2);
            executeUpdate(connection, "DELETE FROM members WHERE months <= 0");
            printQuery(connection, "SELECT * FROM members", "id", "name", "type", "months");
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
