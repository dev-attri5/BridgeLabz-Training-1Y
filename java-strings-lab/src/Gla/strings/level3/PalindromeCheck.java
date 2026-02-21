package Gla.strings.level3;

import java.util.*;
public class PalindromeCheck{
    static boolean iterative(String s){
        int i=0,j=s.length()-1;
        while(i<j) if(s.charAt(i++)!=s.charAt(j--)) return false;
        return true;
    }
    static boolean recursive(String s,int i,int j){
        if(i>=j) return true;
        if(s.charAt(i)!=s.charAt(j)) return false;
        return recursive(s,i+1,j-1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(iterative(s));
        System.out.println(recursive(s,0,s.length()-1));
    }
}
