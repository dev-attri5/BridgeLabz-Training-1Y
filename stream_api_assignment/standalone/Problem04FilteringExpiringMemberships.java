import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Problem04FilteringExpiringMemberships {
    static class Member {
        private final String name;
        private final LocalDate expiryDate;

        Member(String name, LocalDate expiryDate) {
            this.name = name;
            this.expiryDate = expiryDate;
        }

        public LocalDate getExpiryDate() {
            return expiryDate;
        }

        @Override
        public String toString() {
            return name + " -> expires on " + expiryDate;
        }
    }

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate cutoffDate = today.plusDays(30);

        List<Member> members = Arrays.asList(
            new Member("Arjun", today.plusDays(10)),
            new Member("Sneha", today.plusDays(45)),
            new Member("Leena", today.plusDays(28)),
            new Member("Vikram", today.plusDays(5))
        );

        members.stream()
            .filter(member -> !member.getExpiryDate().isBefore(today) && !member.getExpiryDate().isAfter(cutoffDate))
            .sorted(Comparator.comparing(Member::getExpiryDate))
            .forEach(System.out::println);
    }
}
