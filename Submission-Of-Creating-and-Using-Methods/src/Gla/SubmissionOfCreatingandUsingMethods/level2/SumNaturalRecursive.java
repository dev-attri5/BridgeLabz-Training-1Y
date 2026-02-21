package Gla.SubmissionOfCreatingandUsingMethods.level2;

import java.util.*;
public class SumNaturalRecursive{
    static int rec(int n){ return n==0?0:n+rec(n-1);}
    static int formula(int n){ return n*(n+1)/2;}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(rec(n)+" "+formula(n));
    }
}
