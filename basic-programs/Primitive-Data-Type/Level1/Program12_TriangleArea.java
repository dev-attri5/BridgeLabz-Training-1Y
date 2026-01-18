import java.util.Scanner;

public class Program12_TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base in inches: ");
        double base = sc.nextDouble();

        System.out.print("Enter height in inches: ");
        double height = sc.nextDouble();

        double areaInSquareInches = 0.5 * base * height;
        double areaInSquareCm = areaInSquareInches * 2.54 * 2.54;

        System.out.println("Area of Triangle in square inches = " + areaInSquareInches);
        System.out.println("Area of Triangle in square centimeters = " + areaInSquareCm);

        sc.close();
    }
}
