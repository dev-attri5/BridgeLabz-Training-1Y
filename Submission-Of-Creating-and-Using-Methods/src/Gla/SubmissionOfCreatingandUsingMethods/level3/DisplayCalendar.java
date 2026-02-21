
package Gla.SubmissionOfCreatingandUsingMethods.level3;
import java.util.*;
public class DisplayCalendar{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int m=sc.nextInt(),y=sc.nextInt();
Calendar c=new GregorianCalendar(y,m-1,1);
int days=c.getActualMaximum(Calendar.DAY_OF_MONTH);
System.out.println("Sun Mon Tue Wed Thu Fri Sat");
int first=c.get(Calendar.DAY_OF_WEEK)-1;
for(int i=0;i<first;i++) System.out.print("    ");
for(int d=1;d<=days;d++){
System.out.printf("%3d ",d);
if((d+first)%7==0) System.out.println();
}}
}
