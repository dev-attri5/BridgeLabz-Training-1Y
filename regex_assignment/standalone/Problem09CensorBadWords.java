import java.util.regex.Pattern;

public class Problem09CensorBadWords {
    public static void main(String[] args) {
        String input = "This is a damn bad example with some stupid words.";
        String regex = "\\b(?:damn|stupid)\\b";
        String output = Pattern.compile(regex, Pattern.CASE_INSENSITIVE).matcher(input).replaceAll("****");

        System.out.println("Input : " + input);
        System.out.println("Output: " + output);
    }
}
