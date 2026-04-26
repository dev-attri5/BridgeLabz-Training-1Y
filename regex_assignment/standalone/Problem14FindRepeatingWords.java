import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem14FindRepeatingWords {
    public static void main(String[] args) {
        String text = "This is is a repeated repeated word test.";
        Matcher matcher = Pattern.compile("\\b(\\w+)\\s+\\1\\b", Pattern.CASE_INSENSITIVE).matcher(text);
        Set<String> repeatingWords = new LinkedHashSet<>();

        while (matcher.find()) {
            repeatingWords.add(matcher.group(1));
        }

        repeatingWords.forEach(System.out::println);
    }
}
