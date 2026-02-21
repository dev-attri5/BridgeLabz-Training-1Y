package Gla.arrays.level2;

import java.util.*;
public class NumberCheck{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int[] arr=new int[5];
  for(int i=0;i<5;i++) arr[i]=sc.nextInt();
  for(int n:arr){
   if(n>0) System.out.println(n+" "+(n%2==0?"Even":"Odd"));
   else if(n<0) System.out.println("Negative");
   else System.out.println("Zero");
  }
  System.out.println(arr[0]==arr[4]?"Equal":arr[0]>arr[4]?"First greater":"Last greater");
 }
}
