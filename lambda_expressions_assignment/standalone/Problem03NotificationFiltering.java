import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Problem03NotificationFiltering {
    static class Alert {
        private final String patientName;
        private final String type;
        private final String severity;

        Alert(String patientName, String type, String severity) {
            this.patientName = patientName;
            this.type = type;
            this.severity = severity;
        }

        public String getType() {
            return type;
        }

        public String getSeverity() {
            return severity;
        }

        @Override
        public String toString() {
            return patientName + " -> " + type + " (" + severity + ")";
        }
    }

    public static void main(String[] args) {
        List<Alert> alerts = Arrays.asList(
            new Alert("Asha", "Medication Reminder", "Medium"),
            new Alert("Rohan", "Heart Rate Spike", "High"),
            new Alert("Meera", "Appointment Reminder", "Low"),
            new Alert("Kabir", "Oxygen Level Drop", "High")
        );

        Predicate<Alert> highSeverityOnly = alert -> "High".equalsIgnoreCase(alert.getSeverity());
        Predicate<Alert> remindersOnly = alert -> alert.getType().contains("Reminder");

        System.out.println("High severity alerts:");
        alerts.stream()
            .filter(highSeverityOnly)
            .forEach(System.out::println);
        System.out.println();

        System.out.println("Reminder alerts:");
        alerts.stream()
            .filter(remindersOnly)
            .forEach(System.out::println);
    }
}
