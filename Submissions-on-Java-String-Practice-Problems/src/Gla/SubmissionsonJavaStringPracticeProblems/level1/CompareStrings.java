package Gla.SubmissionsonJavaStringPracticeProblems.level1;

import java.util.*;
public class CompareStrings{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String s1=sc.nextLine();
String s2=sc.nextLine();
int i=0;
while(i<s1.length()&&i<s2.length()&&s1.charAt(i)==s2.charAt(i))i++;
if(i<s1.length()&&i<s2.length())
System.out.println(s1.charAt(i)<s2.charAt(i)?s1+" comes before "+s2:s2+" comes before "+s1);
else System.out.println("Strings are equal");
}}