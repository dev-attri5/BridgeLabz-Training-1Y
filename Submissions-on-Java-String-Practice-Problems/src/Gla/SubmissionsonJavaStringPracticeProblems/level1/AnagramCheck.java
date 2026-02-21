package Gla.SubmissionsonJavaStringPracticeProblems.level1;

import java.util.*;
public class AnagramCheck{
public static void main(String[] args){
char[] a=new Scanner(System.in).nextLine().replace(" ","").toLowerCase().toCharArray();
char[] b=new Scanner(System.in).nextLine().replace(" ","").toLowerCase().toCharArray();
Arrays.sort(a);Arrays.sort(b);
System.out.println(Arrays.equals(a,b)?"Anagram":"Not Anagram");
}}