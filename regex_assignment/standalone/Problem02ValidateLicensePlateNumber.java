import java.util.regex.Pattern;

public class Problem02ValidateLicensePlateNumber {
    public static void main(String[] args) {
        String regex = "^[A-Z]{2}\\d{4}$";
        String[] plates = {"AB1234", "A12345", "ZX9087"};

        for (String plate : plates) {
            System.out.println(plate + " -> " + (Pattern.matches(regex, plate) ? "Valid" : "Invalid"));
        }
    }
}
