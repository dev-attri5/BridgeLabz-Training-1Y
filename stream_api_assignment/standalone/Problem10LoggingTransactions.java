import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class Problem10LoggingTransactions {
    public static void main(String[] args) {
        List<String> transactionIds = Arrays.asList("TRX-9001", "TRX-9002", "TRX-9003");
        transactionIds.forEach(id ->
            System.out.println(LocalDateTime.now() + " - Transaction: " + id));
    }
}
