
package Gla.SubmissionOfCreatingandUsingMethods.level3;
public class NumberChecker3{
public static void main(String[] args){
int n=121,rev=0,temp=n;
while(temp>0){rev=rev*10+temp%10;temp/=10;}
System.out.println(n==rev?"Palindrome":"Not");
}}
