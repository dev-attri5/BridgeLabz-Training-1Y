package Gla.SubmissionsonJavaStringPracticeProblems.level1;

import java.util.*;
public class LongestWord{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String[] w=sc.nextLine().split(" ");
String max="";
for(String s:w)if(s.length()>max.length())max=s;
System.out.println(max);
}}