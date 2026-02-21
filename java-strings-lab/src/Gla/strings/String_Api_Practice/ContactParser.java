package Gla.strings.String_Api_Practice;

import java.util.*;
public class ContactParser{
    public static void main(String[] args){
        String data = "John Doe;+1-555-0101;john@email.com;NYC\nJane Smith;+1-555-0102;jane@email.com;LA";
        StringTokenizer contacts = new StringTokenizer(data, "\n");
        int count=0;
        while(contacts.hasMoreTokens()){
            StringTokenizer fields = new StringTokenizer(contacts.nextToken(), ";");
            System.out.println("Name: "+fields.nextToken());
            System.out.println("Phone: "+fields.nextToken());
            System.out.println("Email: "+fields.nextToken());
            System.out.println("Address: "+fields.nextToken());
            count++;
        }
        System.out.println("Total contacts: "+count);
    }
}
