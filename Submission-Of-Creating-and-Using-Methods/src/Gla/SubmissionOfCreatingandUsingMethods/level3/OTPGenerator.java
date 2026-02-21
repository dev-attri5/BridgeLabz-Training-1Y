
package Gla.SubmissionOfCreatingandUsingMethods.level3;
import java.util.*;
public class OTPGenerator{
static int otp(){return 100000+(int)(Math.random()*900000);}
public static void main(String[] args){
int[] a=new int[10];
for(int i=0;i<10;i++){a[i]=otp();System.out.println(a[i]);}
System.out.println("Unique="+(Arrays.stream(a).distinct().count()==10));
}}
