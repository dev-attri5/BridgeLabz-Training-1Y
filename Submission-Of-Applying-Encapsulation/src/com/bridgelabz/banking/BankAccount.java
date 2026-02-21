
package com.bridgelabz.banking;
public abstract class BankAccount{
protected double balance;
public BankAccount(double b){balance=b;}
public void deposit(double amt){balance+=amt;}
public abstract double calculateInterest();
public void display(){System.out.println(balance);}
}
