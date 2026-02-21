package Gla.strings.level1;

import java.util.*;
public class LowerCaseCompare{
 static String toLower(String s){
  String r="";
  for(int i=0;i<s.length();i++){
   char c=s.charAt(i);
   if(c>='A'&&c<='Z') r+=(char)(c+32);
   else r+=c;
  }
  return r;
 }
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  String s=sc.nextLine();
  System.out.println(toLower(s).equals(s.toLowerCase()));
 }
}
