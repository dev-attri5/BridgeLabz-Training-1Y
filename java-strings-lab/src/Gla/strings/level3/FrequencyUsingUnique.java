package Gla.strings.level3;

import java.util.*;
public class FrequencyUsingUnique{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++){
            int count=0;
            for(int j=0;j<s.length();j++)
                if(s.charAt(i)==s.charAt(j)) count++;
            boolean printed=false;
            for(int k=0;k<i;k++)
                if(s.charAt(i)==s.charAt(k)) printed=true;
            if(!printed) System.out.println(s.charAt(i)+" -> "+count);
        }
    }
}
