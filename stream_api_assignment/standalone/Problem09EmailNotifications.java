import java.util.Arrays;
import java.util.List;

public class Problem09EmailNotifications {
    public static void main(String[] args) {
        List<String> emails = Arrays.asList("alex@example.com", "nina@example.com", "samir@example.com");
        emails.forEach(Problem09EmailNotifications::sendEmailNotification);
    }

    private static void sendEmailNotification(String email) {
        System.out.println("Notification email sent to " + email);
    }
}
