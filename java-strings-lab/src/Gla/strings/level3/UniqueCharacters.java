package Gla.strings.level3;

import java.util.*;
public class UniqueCharacters{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String result="";
        for(int i=0;i<s.length();i++){
            boolean unique=true;
            for(int j=0;j<i;j++)
                if(s.charAt(i)==s.charAt(j)) unique=false;
            if(unique) result+=s.charAt(i);
        }
        System.out.println(result);
    }
}
