package Gla.SubmissionOfCreatingandUsingMethods.level1;

import java.util.Scanner;
public class ChocolatesDistribution {
    public static int[] distribute(int ch,int children){
        return new int[]{ch/children,ch%children};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int ch=sc.nextInt(),children=sc.nextInt();
        int[] res=distribute(ch,children);
        System.out.println("Each = "+res[0]+" Remaining = "+res[1]);
    }
}
