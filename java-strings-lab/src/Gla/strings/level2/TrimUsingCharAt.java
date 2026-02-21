package Gla.strings.level2;

import java.util.*;
public class TrimUsingCharAt{
    static String trim(String s){
        int st=0,en=s.length()-1;
        while(st<=en && s.charAt(st)==' ') st++;
        while(en>=st && s.charAt(en)==' ') en--;
        String r="";
        for(int i=st;i<=en;i++) r+=s.charAt(i);
        return r;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(trim(s).equals(s.trim()));
    }
}
