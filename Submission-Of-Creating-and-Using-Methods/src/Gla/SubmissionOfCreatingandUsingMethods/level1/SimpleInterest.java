package Gla.SubmissionOfCreatingandUsingMethods.level1;

import java.util.Scanner;
public class SimpleInterest {
    public static double calculateSI(double p, double r, double t){
        return (p*r*t)/100;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double p=sc.nextDouble(), r=sc.nextDouble(), t=sc.nextDouble();
        System.out.println("Simple Interest = "+calculateSI(p,r,t));
    }
}
