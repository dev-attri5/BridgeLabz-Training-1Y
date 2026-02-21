package Gla.strings.level1;

public class IllegalArgumentDemo{
 public static void main(String[] args){
  try{
   String s="abc";
   System.out.println(s.substring(2,1));
  }catch(Exception e){System.out.println("Handled");}
 }
}
