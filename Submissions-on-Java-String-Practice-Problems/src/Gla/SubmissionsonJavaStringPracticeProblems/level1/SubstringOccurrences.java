package Gla.SubmissionsonJavaStringPracticeProblems.level1;

import java.util.*;
public class SubstringOccurrences{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String sub=sc.nextLine();
int count=0;
for(int i=0;i<=s.length()-sub.length();i++)
if(s.substring(i,i+sub.length()).equals(sub))count++;
System.out.println(count);
}}