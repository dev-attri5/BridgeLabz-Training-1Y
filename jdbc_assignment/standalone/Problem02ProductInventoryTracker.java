import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Problem02ProductInventoryTracker {
    public static void main(String[] args) throws Exception {
        Class.forName("org.sqlite.JDBC");
        Path database = Path.of(System.getProperty("java.io.tmpdir"), "jdbc_assignment", "problem02_product_inventory_tracker.db");
        Files.createDirectories(database.getParent());
        Files.deleteIfExists(database);

        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:" + database)) {
            try (Statement statement = connection.createStatement()) {
                statement.execute("CREATE TABLE product(pid INT PRIMARY KEY, pname VARCHAR(50), qty INT)");
            }

            executeUpdate(connection, "INSERT INTO product VALUES (?, ?, ?)", 101, "Keyboard", 8);
            executeUpdate(connection, "INSERT INTO product VALUES (?, ?, ?)", 102, "Mouse", 25);
            executeUpdate(connection, "INSERT INTO product VALUES (?, ?, ?)", 103, "Monitor", 4);

            printQuery(connection, "SELECT * FROM product WHERE qty < 10", "pid", "pname", "qty");
            executeUpdate(connection, "UPDATE product SET qty = qty + ? WHERE pid = ?", 20, 101);
            executeUpdate(connection, "DELETE FROM product WHERE pid = ?", 103);
            printQuery(connection, "SELECT * FROM product", "pid", "pname", "qty");
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
