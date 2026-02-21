
package com.bridgelabz.banking;
public class SavingsAccount extends BankAccount{
public SavingsAccount(double b){super(b);}
public double calculateInterest(){return balance*0.05;}
}
