import java.util.Arrays;
import java.util.List;

public class Problem08IotSensorReadings {
    public static void main(String[] args) {
        List<Double> readings = Arrays.asList(45.2, 71.8, 66.4, 82.1, 59.7);
        double threshold = 65.0;

        readings.stream()
            .filter(reading -> reading > threshold)
            .forEach(reading -> System.out.println("Reading above threshold: " + reading));
    }
}
