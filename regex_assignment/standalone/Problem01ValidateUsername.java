import java.util.regex.Pattern;

public class Problem01ValidateUsername {
    public static void main(String[] args) {
        String regex = "^[A-Za-z][A-Za-z0-9_]{4,14}$";
        String[] usernames = {"user_123", "123user", "us", "Alpha_99"};

        for (String username : usernames) {
            System.out.println(username + " -> " + (Pattern.matches(regex, username) ? "Valid" : "Invalid"));
        }
    }
}
