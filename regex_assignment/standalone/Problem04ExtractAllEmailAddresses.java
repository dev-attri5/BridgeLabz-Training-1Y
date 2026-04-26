import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem04ExtractAllEmailAddresses {
    public static void main(String[] args) {
        String text = "Contact us at support@example.com and info@company.org for further updates.";
        Matcher matcher = Pattern.compile("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}").matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
