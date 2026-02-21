
package Gla.SubmissionOfCreatingandUsingMethods.level3;
public class CollinearPoints{
public static void main(String[] args){
int x1=2,y1=4,x2=4,y2=6,x3=6,y3=8;
int area=x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2);
System.out.println(area==0?"Collinear":"Not");
}}
