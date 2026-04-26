import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Problem10RestaurantMenuManager {
    public static void main(String[] args) throws Exception {
        Class.forName("org.sqlite.JDBC");
        Path database = Path.of(System.getProperty("java.io.tmpdir"), "jdbc_assignment", "problem10_restaurant_menu_manager.db");
        Files.createDirectories(database.getParent());
        Files.deleteIfExists(database);

        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:" + database)) {
            try (Statement statement = connection.createStatement()) {
                statement.execute("CREATE TABLE menu(id INT PRIMARY KEY, itemName VARCHAR(50), price DOUBLE)");
            }

            executeUpdate(connection, "INSERT INTO menu VALUES (?, ?, ?)", 1, "Masala Dosa", 120.0);
            executeUpdate(connection, "INSERT INTO menu VALUES (?, ?, ?)", 2, "Paneer Tikka", 260.0);
            executeUpdate(connection, "INSERT INTO menu VALUES (?, ?, ?)", 3, "Lime Soda", 80.0);

            printQuery(connection, "SELECT * FROM menu WHERE price < 200", "id", "itemName", "price");
            executeUpdate(connection, "UPDATE menu SET price = ? WHERE id = ?", 140.0, 1);
            executeUpdate(connection, "DELETE FROM menu WHERE id = ?", 2);
            printQuery(connection, "SELECT * FROM menu", "id", "itemName", "price");
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
