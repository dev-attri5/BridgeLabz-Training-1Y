
package com.bridgelabz.interfaces;
interface PaymentProcessor{
void pay(double amt);
default void refund(double amt){
System.out.println("Refund "+amt);
}
}
