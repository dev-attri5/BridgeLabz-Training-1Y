import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem12ExtractProgrammingLanguageNames {
    public static void main(String[] args) {
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        Matcher matcher = Pattern.compile("\\b(?:JavaScript|Java|Python|Go)\\b").matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
