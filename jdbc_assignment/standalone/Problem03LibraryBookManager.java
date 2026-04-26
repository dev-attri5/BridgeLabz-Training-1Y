import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Problem03LibraryBookManager {
    public static void main(String[] args) throws Exception {
        Class.forName("org.sqlite.JDBC");
        Path database = Path.of(System.getProperty("java.io.tmpdir"), "jdbc_assignment", "problem03_library_book_manager.db");
        Files.createDirectories(database.getParent());
        Files.deleteIfExists(database);

        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:" + database)) {
            try (Statement statement = connection.createStatement()) {
                statement.execute("CREATE TABLE books(id INT PRIMARY KEY, title VARCHAR(100), author VARCHAR(50), status VARCHAR(10))");
            }

            executeUpdate(connection, "INSERT INTO books VALUES (?, ?, ?, ?)", 1, "Clean Code", "Robert Martin", "Available");
            executeUpdate(connection, "INSERT INTO books VALUES (?, ?, ?, ?)", 2, "Effective Java", "Joshua Bloch", "Available");
            executeUpdate(connection, "INSERT INTO books VALUES (?, ?, ?, ?)", 3, "Lost Archive", "Unknown", "Issued");

            printQuery(connection, "SELECT * FROM books WHERE status = 'Available'", "id", "title", "author", "status");
            executeUpdate(connection, "UPDATE books SET status = 'Issued' WHERE id = ?", 2);
            executeUpdate(connection, "DELETE FROM books WHERE id = ?", 3);
            printQuery(connection, "SELECT * FROM books", "id", "title", "author", "status");
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
