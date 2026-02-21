
package com.bridgelabz.accessmodifiers;
public class Student {
    public int roll;
    protected String name;
    private double cgpa;

    public Student(int r, String n, double c) {
        roll = r; name = n; cgpa = c;
    }

    public void setCgpa(double c) { cgpa = c; }
    public double getCgpa() { return cgpa; }
}
