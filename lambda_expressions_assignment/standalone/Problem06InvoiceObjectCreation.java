import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Problem06InvoiceObjectCreation {
    static class Invoice {
        private final String transactionId;

        Invoice(String transactionId) {
            this.transactionId = transactionId;
        }

        @Override
        public String toString() {
            return "Invoice{transactionId='" + transactionId + "'}";
        }
    }

    public static void main(String[] args) {
        List<String> transactionIds = Arrays.asList("TXN-501", "TXN-502", "TXN-503");
        Function<String, Invoice> invoiceFactory = Invoice::new;

        List<Invoice> invoices = transactionIds.stream()
            .map(invoiceFactory)
            .collect(Collectors.toList());

        invoices.forEach(System.out::println);
    }
}
