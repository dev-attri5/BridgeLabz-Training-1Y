package Gla.SubmissionsonJavaStringPracticeProblems.level1;

import java.util.*;
public class ToggleCase{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine(),res="";
for(char ch:s.toCharArray()){
if(Character.isUpperCase(ch))res+=Character.toLowerCase(ch);
else if(Character.isLowerCase(ch))res+=Character.toUpperCase(ch);
else res+=ch;}
System.out.println(res);
}}