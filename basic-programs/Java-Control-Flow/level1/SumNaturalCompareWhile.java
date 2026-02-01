import java.util.Scanner;
class SumNaturalCompareWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n >= 0) {
            int sumWhile = 0, i = 1;
            while (i <= n) {
                sumWhile += i;
                i++;
            }
            int sumFormula = n * (n + 1) / 2;
            System.out.println("While Loop Sum = " + sumWhile);
            System.out.println("Formula Sum = " + sumFormula);
        } else {
            System.out.println("Not a natural number");
        }
        input.close();
    }
}