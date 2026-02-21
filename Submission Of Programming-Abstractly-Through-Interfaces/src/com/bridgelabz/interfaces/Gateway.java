
package com.bridgelabz.interfaces;
class Gateway implements PaymentProcessor{
public void pay(double amt){System.out.println("Paid "+amt);}
}
