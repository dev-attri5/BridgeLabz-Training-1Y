import java.util.Scanner;

class MultiplesBelow100While {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int i = 100;

        if (number > 0 && number < 100) {
            while (i >= 1) {
                if (i % number == 0)
                    System.out.println(i);
                i--;
            }
        } else {
            System.out.println("Invalid input");
        }
        input.close();
    }
}