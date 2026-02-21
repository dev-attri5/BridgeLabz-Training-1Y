
package Gla.SubmissionOfCreatingandUsingMethods.level3;
public class NumberChecker5{
static int sumDiv(int n){
int s=0;
for(int i=1;i<n;i++) if(n%i==0)s+=i;
return s;}
public static void main(String[] args){
int n=28;
int s=sumDiv(n);
System.out.println("Perfect="+(s==n));
System.out.println("Abundant="+(s>n));
System.out.println("Deficient="+(s<n));
}}
