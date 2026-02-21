package Gla.SubmissionOfCreatingandUsingMethods.level2;

import java.util.*;
public class YoungestAndTallest{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] age=new int[3];
        double[] h=new double[3];
        for(int i=0;i<3;i++) age[i]=sc.nextInt();
        for(int i=0;i<3;i++) h[i]=sc.nextDouble();
        System.out.println("Youngest="+Arrays.stream(age).min().getAsInt());
        System.out.println("Tallest="+Arrays.stream(h).max().getAsDouble());
    }
}
