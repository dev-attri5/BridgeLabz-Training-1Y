package Gla.strings.level3;

import java.util.*;
public class FirstNonRepeating{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int[] freq=new int[256];
        for(char c:s.toCharArray()) freq[c]++;
        for(char c:s.toCharArray())
            if(freq[c]==1){ System.out.println(c); break; }
    }
}
