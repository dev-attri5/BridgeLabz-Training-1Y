
package com.bridgelabz.employee;
public abstract class Employee{
private int id; private String name; protected double salary;
public Employee(int id,String name,double salary){this.id=id;this.name=name;this.salary=salary;}
public abstract double calculateSalary();
public void display(){System.out.println(id+" "+name+" "+calculateSalary());}
}
