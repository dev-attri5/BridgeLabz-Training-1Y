import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Problem13SimpleToDoTaskManager {
    public static void main(String[] args) throws Exception {
        Class.forName("org.sqlite.JDBC");
        Path database = Path.of(System.getProperty("java.io.tmpdir"), "jdbc_assignment", "problem13_simple_todo_task_manager.db");
        Files.createDirectories(database.getParent());
        Files.deleteIfExists(database);

        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:" + database)) {
            try (Statement statement = connection.createStatement()) {
                statement.execute("CREATE TABLE tasks(id INT PRIMARY KEY, title VARCHAR(100), status VARCHAR(20))");
            }

            executeUpdate(connection, "INSERT INTO tasks VALUES (?, ?, ?)", 1, "Finish JDBC assignment", "Pending");
            executeUpdate(connection, "INSERT INTO tasks VALUES (?, ?, ?)", 2, "Review code", "Completed");
            executeUpdate(connection, "INSERT INTO tasks VALUES (?, ?, ?)", 3, "Submit zip file", "Pending");

            printQuery(connection, "SELECT * FROM tasks WHERE status = 'Pending'", "id", "title", "status");
            executeUpdate(connection, "UPDATE tasks SET status = 'Completed' WHERE id = ?", 1);
            executeUpdate(connection, "DELETE FROM tasks WHERE status = 'Completed'");
            printQuery(connection, "SELECT * FROM tasks", "id", "title", "status");
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
