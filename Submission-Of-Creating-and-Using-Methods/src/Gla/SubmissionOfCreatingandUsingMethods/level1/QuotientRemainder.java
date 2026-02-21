package Gla.SubmissionOfCreatingandUsingMethods.level1;

import java.util.Scanner;
public class QuotientRemainder {
    public static int[] find(int n,int d){
        return new int[]{n/d,n%d};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),d=sc.nextInt();
        int[] res=find(n,d);
        System.out.println("Quotient = "+res[0]+" Remainder = "+res[1]);
    }
}
