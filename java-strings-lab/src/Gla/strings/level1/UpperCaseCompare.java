package Gla.strings.level1;

import java.util.*;
public class UpperCaseCompare{
 static String toUpper(String s){
  String r="";
  for(int i=0;i<s.length();i++){
   char c=s.charAt(i);
   if(c>='a'&&c<='z') r+=(char)(c-32);
   else r+=c;
  }
  return r;
 }
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  String s=sc.nextLine();
  System.out.println(toUpper(s).equals(s.toUpperCase()));
 }
}
