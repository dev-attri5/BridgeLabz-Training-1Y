import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Problem05NameUppercasing {
    public static void main(String[] args) {
        List<String> employees = Arrays.asList("Anita Sharma", "Rahul Verma", "Priya Nair");
        List<String> uppercasedNames = employees.stream()
            .map(String::toUpperCase)
            .collect(Collectors.toList());

        System.out.println("Original names: " + employees);
        System.out.println("Uppercased names: " + uppercasedNames);
    }
}
