package Gla.arrays.level2;

import java.util.*;
public class OddEvenArray{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int[] odd=new int[n/2+1];
  int[] even=new int[n/2+1];
  int oi=0,ei=0;
  for(int i=1;i<=n;i++){
   if(i%2==0) even[ei++]=i;
   else odd[oi++]=i;
  }
  System.out.println("Odd:"+Arrays.toString(Arrays.copyOf(odd,oi)));
  System.out.println("Even:"+Arrays.toString(Arrays.copyOf(even,ei)));
 }
}
