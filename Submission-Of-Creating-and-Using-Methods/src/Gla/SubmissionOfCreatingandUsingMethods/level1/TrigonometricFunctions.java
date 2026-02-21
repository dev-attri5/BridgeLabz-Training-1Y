package Gla.SubmissionOfCreatingandUsingMethods.level1;

import java.util.Scanner;
public class TrigonometricFunctions {
    public static double[] calculate(double angle){
        double rad=Math.toRadians(angle);
        return new double[]{Math.sin(rad),Math.cos(rad),Math.tan(rad)};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double angle=sc.nextDouble();
        double[] res=calculate(angle);
        System.out.println("Sin="+res[0]+" Cos="+res[1]+" Tan="+res[2]);
    }
}
