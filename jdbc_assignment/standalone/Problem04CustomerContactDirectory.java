import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Problem04CustomerContactDirectory {
    public static void main(String[] args) throws Exception {
        Class.forName("org.sqlite.JDBC");
        Path database = Path.of(System.getProperty("java.io.tmpdir"), "jdbc_assignment", "problem04_customer_contact_directory.db");
        Files.createDirectories(database.getParent());
        Files.deleteIfExists(database);

        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:" + database)) {
            try (Statement statement = connection.createStatement()) {
                statement.execute("CREATE TABLE customers(id INT PRIMARY KEY, name VARCHAR(50), phone VARCHAR(15))");
            }

            executeUpdate(connection, "INSERT INTO customers VALUES (?, ?, ?)", 1, "Aarav", "9876543210");
            executeUpdate(connection, "INSERT INTO customers VALUES (?, ?, ?)", 2, "Aisha", "9123456780");
            executeUpdate(connection, "INSERT INTO customers VALUES (?, ?, ?)", 3, "Rohan", "9988776655");

            printQuery(connection, "SELECT * FROM customers WHERE name LIKE ?", new Object[]{"Ai%"}, "id", "name", "phone");
            executeUpdate(connection, "UPDATE customers SET phone = ? WHERE id = ?", "9000011111", 2);
            executeUpdate(connection, "DELETE FROM customers WHERE id = ?", 3);
            printQuery(connection, "SELECT * FROM customers", new Object[0], "id", "name", "phone");
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
