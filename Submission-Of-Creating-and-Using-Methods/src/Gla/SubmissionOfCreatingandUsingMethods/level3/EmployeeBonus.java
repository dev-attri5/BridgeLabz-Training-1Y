
package Gla.SubmissionOfCreatingandUsingMethods.level3;
public class EmployeeBonus{
public static void main(String[] args){
for(int i=1;i<=10;i++){
int salary=10000+(int)(Math.random()*90000);
int years=(int)(Math.random()*10);
double bonus=years>5?salary*0.05:salary*0.02;
System.out.println(salary+" "+years+" "+bonus);
}}
}
