
package com.bridgelabz.banking;
public class BankMain{
public static void main(String[] args){
BankAccount b=new SavingsAccount(10000);
b.deposit(2000);
b.display();
System.out.println(b.calculateInterest());
}}
