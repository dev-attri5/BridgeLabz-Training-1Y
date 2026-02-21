package com.bridgelabz.level2;
public class PalindromeChecker{
private String text;
public PalindromeChecker(String t){text=t;}
public void check(){String r=new StringBuilder(text).reverse().toString();
System.out.println(text.equals(r)?"Palindrome":"Not Palindrome");}
}