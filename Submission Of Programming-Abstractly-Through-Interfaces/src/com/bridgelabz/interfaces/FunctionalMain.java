
package com.bridgelabz.interfaces;
import java.util.function.*;
public class FunctionalMain{
public static void main(String[] args){
Predicate<Double> temp=t->t>30;
System.out.println(temp.test(35.0));

Function<String,Integer> len=s->s.length();
System.out.println(len.apply("Hello"));

Runnable r=()->System.out.println("Task running");
new Thread(r).start();
}}
