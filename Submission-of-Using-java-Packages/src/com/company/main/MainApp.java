
package com.company.main;
import com.company.hr.*;
import com.company.payroll.*;
public class MainApp{
public static void main(String[] args){
Employee e=new Employee();
new Payroll().calc(e);
System.out.println(e);
}}
