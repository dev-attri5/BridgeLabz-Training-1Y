package Gla.strings.level2;

import java.util.*;
public class WordsLength2D{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[] words=sc.nextLine().split(" ");
        String[][] data=new String[words.length][2];
        for(int i=0;i<words.length;i++){
            data[i][0]=words[i];
            data[i][1]=String.valueOf(words[i].length());
        }
        for(String[] row:data) System.out.println(row[0]+" "+row[1]);
    }
}
