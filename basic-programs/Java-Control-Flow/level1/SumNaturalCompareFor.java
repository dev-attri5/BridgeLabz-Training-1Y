import java.util.Scanner;
class SumNaturalCompareFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n >= 0) {
            int sumFor = 0;
            for (int i = 1; i <= n; i++) {
                sumFor += i;
            }
            int sumFormula = n * (n + 1) / 2;
            System.out.println("For Loop Sum = " + sumFor);
            System.out.println("Formula Sum = " + sumFormula);
        } else {
            System.out.println("Not a natural number");
        }
        input.close();
    }
}