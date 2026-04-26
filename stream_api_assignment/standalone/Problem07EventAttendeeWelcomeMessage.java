import java.util.Arrays;
import java.util.List;

public class Problem07EventAttendeeWelcomeMessage {
    public static void main(String[] args) {
        List<String> attendees = Arrays.asList("Ritu", "Karan", "Fatima", "Joel");
        attendees.forEach(attendee -> System.out.println("Welcome to the event, " + attendee + "!"));
    }
}
