package com.bridgelabz.level2;
public class CartItem{
private String name;private double price;private int qty;
public CartItem(String n,double p,int q){name=n;price=p;qty=q;}
public void total(){System.out.println(name+" Total="+price*qty);}
}