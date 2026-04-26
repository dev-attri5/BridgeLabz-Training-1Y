import java.util.regex.Pattern;

public class Problem11ValidateCreditCardNumber {
    public static void main(String[] args) {
        String regex = "^(4\\d{15}|5\\d{15})$";
        String[] cards = {"4123456789012345", "5123456789012345", "6123456789012345", "41234"};

        for (String card : cards) {
            System.out.println(card + " -> " + (Pattern.matches(regex, card) ? "Valid" : "Invalid"));
        }
    }
}
