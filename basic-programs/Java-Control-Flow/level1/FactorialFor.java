import java.util.Scanner;
class FactorialFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n >= 0) {
            long fact = 1;
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            System.out.println("Factorial = " + fact);
        } else {
            System.out.println("Enter a natural number");
        }
        input.close();
    }
}