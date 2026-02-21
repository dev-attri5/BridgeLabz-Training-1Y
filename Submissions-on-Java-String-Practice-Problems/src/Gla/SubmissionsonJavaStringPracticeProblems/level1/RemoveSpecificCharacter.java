package Gla.SubmissionsonJavaStringPracticeProblems.level1;

import java.util.*;
public class RemoveSpecificCharacter{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
char r=sc.next().charAt(0);
String res="";
for(char ch:s.toCharArray())if(ch!=r)res+=ch;
System.out.println(res);
}}