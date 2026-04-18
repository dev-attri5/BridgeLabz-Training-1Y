import java.util.Scanner;

public class ReplaceZero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String num = sc.nextLine();

        num = num.replace('0', '1');

        System.out.println("Result: " + num);
    }
}
