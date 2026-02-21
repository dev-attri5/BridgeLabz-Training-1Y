
package Gla.SubmissionOfCreatingandUsingMethods.level3;
import java.util.*;
public class MatrixAdvanced{
public static void main(String[] args){
int[][] m={{1,2},{3,4}};
System.out.println("Transpose:");
for(int i=0;i<2;i++){
for(int j=0;j<2;j++) System.out.print(m[j][i]+" ");
System.out.println();
}
int det=m[0][0]*m[1][1]-m[0][1]*m[1][0];
System.out.println("Det="+det);
}}
