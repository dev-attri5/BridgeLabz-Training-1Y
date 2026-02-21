package com.bridgelabz.level2;
public class Student{
private String name;private int roll;private double marks;
public Student(String n,int r,double m){name=n;roll=r;marks=m;}
String grade(){if(marks>=80)return"A";if(marks>=70)return"B";if(marks>=60)return"C";if(marks>=50)return"D";return"F";}
public void display(){System.out.println(name+" "+roll+" "+marks+" Grade="+grade());}
}