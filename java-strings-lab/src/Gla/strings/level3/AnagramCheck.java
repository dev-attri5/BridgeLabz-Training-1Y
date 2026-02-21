package Gla.strings.level3;

import java.util.*;
public class AnagramCheck{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.next(),b=sc.next();
        int[] f=new int[256];
        for(char c:a.toCharArray()) f[c]++;
        for(char c:b.toCharArray()) f[c]--;
        for(int i:f) if(i!=0){ System.out.println("Not Anagram"); return; }
        System.out.println("Anagram");
    }
}
