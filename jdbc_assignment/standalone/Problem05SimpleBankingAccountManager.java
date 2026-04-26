import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Problem05SimpleBankingAccountManager {
    public static void main(String[] args) throws Exception {
        Class.forName("org.sqlite.JDBC");
        Path database = Path.of(System.getProperty("java.io.tmpdir"), "jdbc_assignment", "problem05_simple_banking_account_manager.db");
        Files.createDirectories(database.getParent());
        Files.deleteIfExists(database);

        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:" + database)) {
            try (Statement statement = connection.createStatement()) {
                statement.execute("CREATE TABLE accounts(accNo INT PRIMARY KEY, name VARCHAR(50), balance DOUBLE)");
            }

            executeUpdate(connection, "INSERT INTO accounts VALUES (?, ?, ?)", 1001, "Dev", 15000.0);
            executeUpdate(connection, "INSERT INTO accounts VALUES (?, ?, ?)", 1002, "Sara", 9500.0);
            executeUpdate(connection, "INSERT INTO accounts VALUES (?, ?, ?)", 1003, "Kabir", 22000.0);

            printQuery(connection, "SELECT * FROM accounts WHERE balance > 10000", "accNo", "name", "balance");
            executeUpdate(connection, "UPDATE accounts SET balance = balance + ? WHERE accNo = ?", 2500.0, 1002);
            executeUpdate(connection, "UPDATE accounts SET balance = balance - ? WHERE accNo = ?", 5000.0, 1001);
            executeUpdate(connection, "DELETE FROM accounts WHERE accNo = ?", 1003);
            printQuery(connection, "SELECT * FROM accounts", "accNo", "name", "balance");
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
