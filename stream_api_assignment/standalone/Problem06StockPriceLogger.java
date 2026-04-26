import java.util.Arrays;
import java.util.List;

public class Problem06StockPriceLogger {
    public static void main(String[] args) {
        List<Double> stockPrices = Arrays.asList(142.35, 143.10, 141.85, 144.20);
        stockPrices.forEach(price -> System.out.println("Live stock price update: " + price));
    }
}
