
package Gla.SubmissionOfCreatingandUsingMethods.level3;
import java.util.*;
public class FactorsArray{
public static void main(String[] args){
int n=12;
ArrayList<Integer> f=new ArrayList<>();
for(int i=1;i<=n;i++) if(n%i==0)f.add(i);
System.out.println(f);
}}
