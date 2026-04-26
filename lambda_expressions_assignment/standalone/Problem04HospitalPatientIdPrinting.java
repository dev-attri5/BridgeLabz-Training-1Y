import java.util.Arrays;
import java.util.List;

public class Problem04HospitalPatientIdPrinting {
    public static void main(String[] args) {
        List<String> patientIds = Arrays.asList("PAT-1001", "PAT-1002", "PAT-1003", "PAT-1004");
        patientIds.forEach(System.out::println);
    }
}
