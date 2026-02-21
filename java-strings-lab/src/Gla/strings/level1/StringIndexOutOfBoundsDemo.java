package Gla.strings.level1;

import java.util.*;
public class StringIndexOutOfBoundsDemo{
 static void handle(String s){
  try{System.out.println(s.charAt(100));}
  catch(Exception e){System.out.println("Handled");}
 }
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  handle(sc.next());
 }
}
