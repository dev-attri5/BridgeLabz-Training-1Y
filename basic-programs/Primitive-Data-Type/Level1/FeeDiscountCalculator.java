import java.util.Scanner;

public class FeeDiscountCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Fee (INR): ");
        double fee = sc.nextDouble();

        System.out.print("Enter University Discount Percent: ");
        double discountPercent = sc.nextDouble();

        double discountAmount = (discountPercent / 100) * fee;
        double finalFee = fee - discountAmount;

        System.out.println("The discount amount is INR " + discountAmount +
                " and final discounted fee is INR " + finalFee);

        sc.close();
    }
}
