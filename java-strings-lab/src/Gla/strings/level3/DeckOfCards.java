package Gla.strings.level3;

import java.util.*;
public class DeckOfCards{
    public static void main(String[] args){
        String[] suits={"Hearts","Diamonds","Clubs","Spades"};
        String[] ranks={"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
        List<String> deck=new ArrayList<>();
        for(String s:suits)
            for(String r:ranks)
                deck.add(r+" of "+s);

        Collections.shuffle(deck);

        Scanner sc=new Scanner(System.in);
        int players=sc.nextInt(),cards=sc.nextInt();
        for(int i=0;i<players;i++){
            System.out.println("Player "+(i+1)+":");
            for(int j=0;j<cards;j++)
                System.out.println(deck.remove(0));
        }
    }
}
