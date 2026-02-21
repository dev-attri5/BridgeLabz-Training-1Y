
package com.bridgelabz.interfaces;
public class DefaultMain{
public static void main(String[] args){
PaymentProcessor g=new Gateway();
g.pay(1000);
g.refund(200);
}}
