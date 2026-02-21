package com.bridgelabz.level2;
public class BankAccount{
private String holder;private int acc;private double bal;
public BankAccount(String h,int a,double b){holder=h;acc=a;bal=b;}
public void deposit(double a){bal+=a;}
public void withdraw(double a){if(a<=bal)bal-=a;}
public void display(){System.out.println(holder+" Balance="+bal);}
}