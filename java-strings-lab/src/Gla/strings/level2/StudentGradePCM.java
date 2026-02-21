package Gla.strings.level2;

import java.util.*;
public class StudentGradePCM{
    static String grade(double p){
        if(p>=80) return "A";
        if(p>=70) return "B";
        if(p>=60) return "C";
        if(p>=50) return "D";
        if(p>=40) return "E";
        return "R";
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            double p=sc.nextDouble(),c=sc.nextDouble(),m=sc.nextDouble();
            double per=(p+c+m)/3;
            System.out.println(per+" -> "+grade(per));
        }
    }
}
