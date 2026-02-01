
import java.util.Scanner;

class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double physics = input.nextDouble();
        double chemistry = input.nextDouble();
        double maths = input.nextDouble();

        double average = (physics + chemistry + maths) / 3;

        System.out.println("Average: " + average);

        if (average >= 80) System.out.println("Grade A");
        else if (average >= 70) System.out.println("Grade B");
        else if (average >= 60) System.out.println("Grade C");
        else if (average >= 50) System.out.println("Grade D");
        else if (average >= 40) System.out.println("Grade E");
        else System.out.println("Grade R");

        input.close();
    }
}
