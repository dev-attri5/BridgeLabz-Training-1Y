package Gla.strings.level1;

import java.util.*;
public class CharArrayCompare{
 static char[] getChars(String s){
  char[] c=new char[s.length()];
  for(int i=0;i<s.length();i++) c[i]=s.charAt(i);
  return c;
 }
 static boolean compare(char[] a,char[] b){
  if(a.length!=b.length) return false;
  for(int i=0;i<a.length;i++) if(a[i]!=b[i]) return false;
  return true;
 }
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  String s=sc.next();
  System.out.println(compare(getChars(s),s.toCharArray()));
 }
}
