package com.bridgelabz.level2;
public class MovieTicket{
private String movie;private int seat;private double price;
public void book(String m,int s,double p){movie=m;seat=s;price=p;}
public void display(){System.out.println(movie+" Seat="+seat+" Price="+price);}
}