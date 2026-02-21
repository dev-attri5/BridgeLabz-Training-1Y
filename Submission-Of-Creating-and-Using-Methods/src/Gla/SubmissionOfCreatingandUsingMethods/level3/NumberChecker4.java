
package Gla.SubmissionOfCreatingandUsingMethods.level3;
public class NumberChecker4{
static boolean prime(int n){
if(n<2)return false;
for(int i=2;i<=Math.sqrt(n);i++) if(n%i==0)return false;
return true;}
static boolean buzz(int n){return n%7==0||n%10==7;}
public static void main(String[] args){
int n=7;
System.out.println("Prime="+prime(n));
System.out.println("Buzz="+buzz(n));
}}
