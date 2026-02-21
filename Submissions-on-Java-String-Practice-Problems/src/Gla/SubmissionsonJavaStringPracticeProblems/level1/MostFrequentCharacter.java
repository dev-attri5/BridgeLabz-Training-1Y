package Gla.SubmissionsonJavaStringPracticeProblems.level1;

import java.util.*;
public class MostFrequentCharacter{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
int max=0;char res=' ';
for(char ch:s.toCharArray()){
int count=0;
for(char c:s.toCharArray())if(ch==c)count++;
if(count>max){max=count;res=ch;}
}
System.out.println(res);
}}