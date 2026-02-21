package Gla.arrays.level2;

import java.util.*;
public class VotingEligibility {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] age=new int[10];
        for(int i=0;i<age.length;i++){
            age[i]=sc.nextInt();
            if(age[i]<0){System.out.println("Invalid age"); i--;}
        }
        for(int a:age){
            if(a>=18) System.out.println(a+" can vote");
            else System.out.println(a+" cannot vote");
        }
    }
}
