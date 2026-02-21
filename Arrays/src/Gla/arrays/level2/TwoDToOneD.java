package Gla.arrays.level2;

import java.util.*;
public class TwoDToOneD{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int r=sc.nextInt(),c=sc.nextInt();
  int[][] a=new int[r][c];
  for(int i=0;i<r;i++) for(int j=0;j<c;j++) a[i][j]=sc.nextInt();
  int[] b=new int[r*c]; int k=0;
  for(int i=0;i<r;i++) for(int j=0;j<c;j++) b[k++]=a[i][j];
  System.out.println(Arrays.toString(b));
 }
}
