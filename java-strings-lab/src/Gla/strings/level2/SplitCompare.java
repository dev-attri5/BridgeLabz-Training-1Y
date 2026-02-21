package Gla.strings.level2;

import java.util.*;
public class SplitCompare{
    static String[] manualSplit(String s){
        ArrayList<String> list=new ArrayList<>();
        String word="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                if(!word.equals("")){list.add(word); word="";}
            }else word+=s.charAt(i);
        }
        if(!word.equals("")) list.add(word);
        return list.toArray(new String[0]);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(Arrays.equals(manualSplit(s),s.split(" ")));
    }
}
