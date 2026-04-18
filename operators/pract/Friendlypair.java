import java.util.Scanner;

public class Friendlypair {

    public static int sumOfDivisors(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int sum1 = sumOfDivisors(num1);
        int sum2 = sumOfDivisors(num2);

        if ((double)sum1 / num1 == (double)sum2 / num2) {
            System.out.println("Friendly Pair");
        } else {
            System.out.println("Not a Friendly Pair");
        }
    }
}

