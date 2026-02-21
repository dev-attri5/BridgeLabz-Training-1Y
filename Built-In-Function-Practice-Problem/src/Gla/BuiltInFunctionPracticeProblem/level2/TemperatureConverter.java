package Gla.BuiltInFunctionPracticeProblem.level2;

import java.util.*;

public class TemperatureConverter {
    static double cToF(double c) { return (c * 9/5) + 32; }
    static double fToC(double f) { return (f - 32) * 5/9; }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double val = sc.nextDouble();
        char ch = sc.next().charAt(0);

        if (ch == 'C') System.out.println(cToF(val));
        else System.out.println(fToC(val));
    }
}
