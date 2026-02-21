package Gla.SubmissionOfCreatingandUsingMethods.level2;

import java.util.*;
public class BMICalculator{
    static double bmi(double w,double h){ h/=100; return w/(h*h);}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<10;i++){
            double w=sc.nextDouble(),h=sc.nextDouble();
            double b=bmi(w,h);
            System.out.println("BMI="+b);
        }
    }
}
