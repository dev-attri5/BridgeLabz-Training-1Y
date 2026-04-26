import java.util.regex.Pattern;

public class Problem03ValidateHexColorCode {
    public static void main(String[] args) {
        String regex = "^#[0-9A-Fa-f]{6}$";
        String[] colors = {"#FFA500", "#ff4500", "#123", "#00CC99"};

        for (String color : colors) {
            System.out.println(color + " -> " + (Pattern.matches(regex, color) ? "Valid" : "Invalid"));
        }
    }
}
