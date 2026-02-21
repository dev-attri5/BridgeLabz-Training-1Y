package Gla.SubmissionOfCreatingandUsingMethods.level2;

import java.util.*;
public class FactorsArray{
    static int[] getFactors(int n){
        int count=0;
        for(int i=1;i<=n;i++) if(n%i==0) count++;
        int[] arr=new int[count];
        int k=0;
        for(int i=1;i<=n;i++) if(n%i==0) arr[k++]=i;
        return arr;
    }
    static int sum(int[] a){int s=0; for(int x:a)s+=x; return s;}
    static int product(int[] a){int p=1; for(int x:a)p*=x; return p;}
    static int sumSquare(int[] a){int s=0; for(int x:a)s+=Math.pow(x,2); return s;}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] f=getFactors(n);
        System.out.println(Arrays.toString(f));
        System.out.println("Sum="+sum(f));
        System.out.println("Product="+product(f));
        System.out.println("SumSquare="+sumSquare(f));
    }
}
