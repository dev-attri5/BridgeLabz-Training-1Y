import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Problem12BookstoreSalesTracking {
    public static void main(String[] args) throws Exception {
        Class.forName("org.sqlite.JDBC");
        Path database = Path.of(System.getProperty("java.io.tmpdir"), "jdbc_assignment", "problem12_bookstore_sales_tracking.db");
        Files.createDirectories(database.getParent());
        Files.deleteIfExists(database);

        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:" + database)) {
            try (Statement statement = connection.createStatement()) {
                statement.execute("CREATE TABLE sales(id INT PRIMARY KEY, bookName VARCHAR(100), quantity INT, price DOUBLE)");
            }

            executeUpdate(connection, "INSERT INTO sales VALUES (?, ?, ?, ?)", 1, "Atomic Habits", 2, 499.0);
            executeUpdate(connection, "INSERT INTO sales VALUES (?, ?, ?, ?)", 2, "Deep Work", 1, 399.0);
            executeUpdate(connection, "INSERT INTO sales VALUES (?, ?, ?, ?)", 3, "Refactoring", 3, 699.0);

            printQuery(connection, "SELECT * FROM sales WHERE quantity > 1", "id", "bookName", "quantity", "price");
            executeUpdate(connection, "UPDATE sales SET quantity = ? WHERE id = ?", 4, 1);
            executeUpdate(connection, "DELETE FROM sales WHERE id = ?", 2);
            printQuery(connection, "SELECT * FROM sales", "id", "bookName", "quantity", "price");
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
