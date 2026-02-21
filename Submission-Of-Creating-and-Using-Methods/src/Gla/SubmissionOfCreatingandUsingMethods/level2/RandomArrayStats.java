package Gla.SubmissionOfCreatingandUsingMethods.level2;

import java.util.*;
public class RandomArrayStats{
    static int[] gen(int n){
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=(int)(Math.random()*9000)+1000;
        return a;
    }
    public static void main(String[] args){
        int[] a=gen(5);
        System.out.println(Arrays.toString(a));
        System.out.println("Min="+Arrays.stream(a).min().getAsInt());
        System.out.println("Max="+Arrays.stream(a).max().getAsInt());
        System.out.println("Avg="+Arrays.stream(a).average().getAsDouble());
    }
}
