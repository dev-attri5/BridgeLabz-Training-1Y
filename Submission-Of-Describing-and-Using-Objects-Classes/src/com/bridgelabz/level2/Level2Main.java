package com.bridgelabz.level2;
public class Level2Main{
public static void main(String[] args){
new Student("Dev",1,78).display();
BankAccount b=new BankAccount("Dev",123,1000);
b.deposit(500);b.withdraw(200);b.display();
new PalindromeChecker("madam").check();
MovieTicket t=new MovieTicket();t.book("Pushpa",5,250);t.display();
new CartItem("Shoes",2000,2).total();
}}