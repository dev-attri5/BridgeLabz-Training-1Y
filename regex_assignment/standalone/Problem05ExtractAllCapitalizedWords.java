import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem05ExtractAllCapitalizedWords {
    public static void main(String[] args) {
        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        Matcher matcher = Pattern.compile("\\b[A-Z][a-zA-Z]*\\b").matcher(text);

        while (matcher.find()) {
            if (!"The".equals(matcher.group())) {
                System.out.println(matcher.group());
            }
        }
    }
}
