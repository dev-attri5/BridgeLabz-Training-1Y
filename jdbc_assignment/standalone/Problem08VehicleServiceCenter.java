import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Problem08VehicleServiceCenter {
    public static void main(String[] args) throws Exception {
        Class.forName("org.sqlite.JDBC");
        Path database = Path.of(System.getProperty("java.io.tmpdir"), "jdbc_assignment", "problem08_vehicle_service_center.db");
        Files.createDirectories(database.getParent());
        Files.deleteIfExists(database);

        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:" + database)) {
            try (Statement statement = connection.createStatement()) {
                statement.execute("CREATE TABLE vehicles(regNo VARCHAR(20) PRIMARY KEY, owner VARCHAR(50), status VARCHAR(20))");
            }

            executeUpdate(connection, "INSERT INTO vehicles VALUES (?, ?, ?)", "TN10AB1234", "Harish", "Pending");
            executeUpdate(connection, "INSERT INTO vehicles VALUES (?, ?, ?)", "KA05CD7788", "Latha", "Completed");
            executeUpdate(connection, "INSERT INTO vehicles VALUES (?, ?, ?)", "MH12EF4567", "Nitin", "Pending");

            printQuery(connection, "SELECT * FROM vehicles WHERE status = 'Pending'", "regNo", "owner", "status");
            executeUpdate(connection, "UPDATE vehicles SET status = 'Completed' WHERE regNo = ?", "TN10AB1234");
            executeUpdate(connection, "DELETE FROM vehicles WHERE regNo = ?", "KA05CD7788");
            printQuery(connection, "SELECT * FROM vehicles", "regNo", "owner", "status");
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
