package Gla.strings.level2;

import java.util.*;
public class CharacterTypeTable{
    static String type(char c){
        if(Character.isLetter(c)){
            char x=Character.toLowerCase(c);
            if("aeiou".indexOf(x)!=-1) return "Vowel";
            return "Consonant";
        }
        return "Not Letter";
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        for(char c:s.toCharArray())
            System.out.println(c+" -> "+type(c));
    }
}
