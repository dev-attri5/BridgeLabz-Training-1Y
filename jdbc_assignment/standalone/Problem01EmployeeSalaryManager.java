import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Problem01EmployeeSalaryManager {
    public static void main(String[] args) throws Exception {
        Class.forName("org.sqlite.JDBC");
        Path database = Path.of(System.getProperty("java.io.tmpdir"), "jdbc_assignment", "problem01_employee_salary_manager.db");
        Files.createDirectories(database.getParent());
        Files.deleteIfExists(database);

        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:" + database)) {
            try (Statement statement = connection.createStatement()) {
                statement.execute("CREATE TABLE employee(id INT PRIMARY KEY, name VARCHAR(50), salary DOUBLE)");
            }

            executeUpdate(connection, "INSERT INTO employee VALUES (?, ?, ?)", 1, "Anita", 52000.0);
            executeUpdate(connection, "INSERT INTO employee VALUES (?, ?, ?)", 2, "Rahul", 28000.0);
            executeUpdate(connection, "INSERT INTO employee VALUES (?, ?, ?)", 3, "Meera", 14000.0);

            printQuery(connection, "SELECT * FROM employee WHERE salary > 30000", "id", "name", "salary");
            executeUpdate(connection, "UPDATE employee SET salary = salary * 1.10 WHERE id = ?", 2);
            executeUpdate(connection, "DELETE FROM employee WHERE salary < 15000");
            printQuery(connection, "SELECT * FROM employee", "id", "name", "salary");
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
