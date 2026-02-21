
package com.bridgelabz.employee;
public class PartTimeEmployee extends Employee{
int hours;
public PartTimeEmployee(int id,String name,double pay,int hours){super(id,name,pay);this.hours=hours;}
public double calculateSalary(){return salary*hours;}
}
