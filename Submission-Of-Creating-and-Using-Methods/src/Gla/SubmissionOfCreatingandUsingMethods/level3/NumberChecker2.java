
package Gla.SubmissionOfCreatingandUsingMethods.level3;
import java.util.*;
public class NumberChecker2{
public static void main(String[] args){
int n=21,sum=0,temp=n;
while(temp>0){sum+=temp%10;temp/=10;}
System.out.println("Harshad="+(n%sum==0));
int[] freq=new int[10];
temp=n;
while(temp>0){freq[temp%10]++;temp/=10;}
System.out.println(Arrays.toString(freq));
}}
