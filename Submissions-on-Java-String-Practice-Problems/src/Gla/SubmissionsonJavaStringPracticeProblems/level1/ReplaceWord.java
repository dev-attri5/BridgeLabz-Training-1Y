package Gla.SubmissionsonJavaStringPracticeProblems.level1;

import java.util.*;
public class ReplaceWord{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String oldW=sc.next();
String newW=sc.next();
System.out.println(s.replace(oldW,newW));
}}