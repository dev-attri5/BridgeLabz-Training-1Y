package com.bridgelabz.level1;
public class Item{
private int code;private String name;private double price;
public Item(int c,String n,double p){code=c;name=n;price=p;}
public void totalCost(int q){System.out.println(name+" Total="+price*q);}
}