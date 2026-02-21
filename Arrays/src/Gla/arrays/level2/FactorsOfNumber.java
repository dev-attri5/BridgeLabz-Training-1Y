package Gla.arrays.level2;

import java.util.*;
public class FactorsOfNumber{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int[] f=new int[n]; int idx=0;
  for(int i=1;i<=n;i++) if(n%i==0) f[idx++]=i;
  for(int i=0;i<idx;i++) System.out.print(f[i]+" ");
 }
}
