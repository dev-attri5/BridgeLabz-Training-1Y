import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Problem07HospitalPatientRecordSystem {
    public static void main(String[] args) throws Exception {
        Class.forName("org.sqlite.JDBC");
        Path database = Path.of(System.getProperty("java.io.tmpdir"), "jdbc_assignment", "problem07_hospital_patient_record_system.db");
        Files.createDirectories(database.getParent());
        Files.deleteIfExists(database);

        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:" + database)) {
            try (Statement statement = connection.createStatement()) {
                statement.execute("CREATE TABLE patients(id INT PRIMARY KEY, name VARCHAR(50), disease VARCHAR(50))");
            }

            executeUpdate(connection, "INSERT INTO patients VALUES (?, ?, ?)", 1, "Neha", "Flu");
            executeUpdate(connection, "INSERT INTO patients VALUES (?, ?, ?)", 2, "Vijay", "Diabetes");
            executeUpdate(connection, "INSERT INTO patients VALUES (?, ?, ?)", 3, "Kriti", "Flu");

            printQuery(connection, "SELECT * FROM patients WHERE disease = ?", new Object[]{"Flu"}, "id", "name", "disease");
            executeUpdate(connection, "UPDATE patients SET disease = ? WHERE id = ?", "Recovered", 1);
            executeUpdate(connection, "DELETE FROM patients WHERE id = ?", 3);
            printQuery(connection, "SELECT * FROM patients", new Object[0], "id", "name", "disease");
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
