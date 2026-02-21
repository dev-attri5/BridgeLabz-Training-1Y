package Gla.strings.String_Api_Practice;

import java.util.*;
public class ChatFormatter{
    public static void main(String[] args){
        String msg="Hello @John #Java /help";
        StringTokenizer st=new StringTokenizer(msg);
        while(st.hasMoreTokens()){
            String token=st.nextToken();
            if(token.startsWith("@")) System.out.println("Mention: "+token);
            else if(token.startsWith("#")) System.out.println("Hashtag: "+token);
            else if(token.startsWith("/")) System.out.println("Command: "+token);
            else System.out.println("Word: "+token);
        }
    }
}
