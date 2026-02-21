package com.bridgelabz.level1;
public class Circle{
private double r;
public Circle(double r){this.r=r;}
public void display(){
System.out.println("Area="+Math.PI*r*r);
System.out.println("Circumference="+2*Math.PI*r);
}}