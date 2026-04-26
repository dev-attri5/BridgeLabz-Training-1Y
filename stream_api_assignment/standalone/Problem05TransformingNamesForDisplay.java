import java.util.Arrays;
import java.util.List;

public class Problem05TransformingNamesForDisplay {
    public static void main(String[] args) {
        List<String> customers = Arrays.asList("zoya", "Arun", "megha", "Bhavesh");

        customers.stream()
            .map(String::toUpperCase)
            .sorted()
            .forEach(System.out::println);
    }
}
