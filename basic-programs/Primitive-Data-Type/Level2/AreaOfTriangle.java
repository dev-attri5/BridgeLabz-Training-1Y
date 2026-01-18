import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base (in inches): ");
        double base = sc.nextDouble();

        System.out.print("Enter height (in inches): ");
        double height = sc.nextDouble();

        double areaInSqInches = 0.5 * base * height;
        double areaInSqCm = areaInSqInches * 2.54 * 2.54;

        System.out.println("Area of triangle in sq inches = " + areaInSqInches);
        System.out.println("Area of triangle in sq cm = " + areaInSqCm);

        sc.close();
    }
}
