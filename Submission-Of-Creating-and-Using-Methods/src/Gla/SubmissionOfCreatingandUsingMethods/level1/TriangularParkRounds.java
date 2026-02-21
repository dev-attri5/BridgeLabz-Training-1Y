package Gla.SubmissionOfCreatingandUsingMethods.level1;

import java.util.Scanner;
public class TriangularParkRounds {
    public static double rounds(double a,double b,double c){
        double perimeter=a+b+c;
        return 5000/perimeter;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble(),b=sc.nextDouble(),c=sc.nextDouble();
        System.out.println("Rounds = "+rounds(a,b,c));
    }
}
