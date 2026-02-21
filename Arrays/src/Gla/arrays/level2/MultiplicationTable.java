package Gla.arrays.level2;

import java.util.*;
public class MultiplicationTable{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int[] table=new int[10];
  for(int i=0;i<10;i++) table[i]=n*(i+1);
  for(int i=0;i<10;i++) System.out.println(n+"*"+(i+1)+"="+table[i]);
 }
}
