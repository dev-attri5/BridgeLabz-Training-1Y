package Gla.SubmissionsonJavaStringPracticeProblems.level1;

import java.util.*;
public class CountVowelsConsonants{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine().toLowerCase();
int v=0,c=0;
for(char ch:s.toCharArray()){
if(Character.isLetter(ch)){
if("aeiou".indexOf(ch)!=-1)v++; else c++;
}}
System.out.println("Vowels="+v+" Consonants="+c);
}}