
package com.bridgelabz.accessmodifiers;
public class PostgraduateStudent extends Student {
    public PostgraduateStudent(int r, String n, double c) {
        super(r, n, c);
    }

    public void display() {
        System.out.println(roll + " " + name + " " + getCgpa());
    }
}
