package Gla.strings.level1;

public class ArrayIndexOutOfBoundsDemo{
 public static void main(String[] args){
  try{
   int[] a=new int[3];
   System.out.println(a[5]);
  }catch(Exception e){System.out.println("Handled");}
 }
}
