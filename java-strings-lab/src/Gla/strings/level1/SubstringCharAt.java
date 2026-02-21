package Gla.strings.level1;

import java.util.*;
public class SubstringCharAt{
 static String sub(String s,int st,int en){
  String r="";
  for(int i=st;i<en;i++) r+=s.charAt(i);
  return r;
 }
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  String s=sc.next();
  int st=sc.nextInt(),en=sc.nextInt();
  String s1=sub(s,st,en);
  String s2=s.substring(st,en);
  System.out.println(s1.equals(s2));
 }
}
