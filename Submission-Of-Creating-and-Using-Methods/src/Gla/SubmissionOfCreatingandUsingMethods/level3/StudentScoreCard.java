
package Gla.SubmissionOfCreatingandUsingMethods.level3;
public class StudentScoreCard{
public static void main(String[] args){
int students=5;
for(int i=1;i<=students;i++){
int p=50+(int)(Math.random()*50);
int c=50+(int)(Math.random()*50);
int m=50+(int)(Math.random()*50);
int total=p+c+m;
double per=total/3.0;
System.out.println(p+" "+c+" "+m+" Total="+total+" %="+per);
}}
}
