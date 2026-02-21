package Gla.strings.level2;

import java.util.*;
public class LengthWithoutLength{
    static int findLength(String s){
        int count=0;
        try{
            while(true){ s.charAt(count); count++; }
        }catch(Exception e){}
        return count;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(findLength(s));
        System.out.println(s.length());
    }
}
