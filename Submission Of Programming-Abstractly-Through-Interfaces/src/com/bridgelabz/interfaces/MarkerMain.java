
package com.bridgelabz.interfaces;
public class MarkerMain{
public static void main(String[] args){
UserData u=new UserData();
if(u instanceof Sensitive)
System.out.println("Encrypting sensitive data");
}}
