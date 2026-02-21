package Gla.SubmissionOfCreatingandUsingMethods.level1;

import java.util.Scanner;
public class WindChill {
    public static double calculate(double t,double v){
        return 35.74 + 0.6215*t + (0.4275*t - 35.75)*Math.pow(v,0.16);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double t=sc.nextDouble(),v=sc.nextDouble();
        System.out.println("Wind Chill = "+calculate(t,v));
    }
}
