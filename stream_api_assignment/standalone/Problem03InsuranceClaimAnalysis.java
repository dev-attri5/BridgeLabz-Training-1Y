import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Problem03InsuranceClaimAnalysis {
    static class Claim {
        private final String claimType;
        private final double amount;

        Claim(String claimType, double amount) {
            this.claimType = claimType;
            this.amount = amount;
        }

        public String getClaimType() {
            return claimType;
        }

        public double getAmount() {
            return amount;
        }
    }

    public static void main(String[] args) {
        List<Claim> claims = Arrays.asList(
            new Claim("Health", 12000),
            new Claim("Vehicle", 8000),
            new Claim("Health", 18000),
            new Claim("Travel", 5000),
            new Claim("Vehicle", 14000),
            new Claim("Travel", 7000)
        );

        Map<String, Double> averageByType = claims.stream()
            .collect(Collectors.groupingBy(Claim::getClaimType, Collectors.averagingDouble(Claim::getAmount)));

        averageByType.forEach((type, average) ->
            System.out.println(type + " average claim = " + average));
    }
}
