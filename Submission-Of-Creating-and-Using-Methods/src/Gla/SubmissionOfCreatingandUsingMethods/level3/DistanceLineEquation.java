
package Gla.SubmissionOfCreatingandUsingMethods.level3;
public class DistanceLineEquation{
public static void main(String[] args){
double x1=2,y1=3,x2=4,y2=6;
double dist=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
double m=(y2-y1)/(x2-x1);
double b=y1-m*x1;
System.out.println("Distance="+dist);
System.out.println("y="+m+"x+"+b);
}}
