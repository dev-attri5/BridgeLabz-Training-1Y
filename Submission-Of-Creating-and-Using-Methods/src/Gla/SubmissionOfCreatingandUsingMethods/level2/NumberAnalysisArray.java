package Gla.SubmissionOfCreatingandUsingMethods.level2;

import java.util.*;
public class NumberAnalysisArray{
    static int compare(int a,int b){ return Integer.compare(a,b);}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
            if(arr[i]>=0) System.out.println(arr[i]%2==0?"Even":"Odd");
            else System.out.println("Negative");
        }
        System.out.println(compare(arr[0],arr[4]));
    }
}
