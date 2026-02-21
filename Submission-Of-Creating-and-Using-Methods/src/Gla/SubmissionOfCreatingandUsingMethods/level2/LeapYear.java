package Gla.SubmissionOfCreatingandUsingMethods.level2;

import java.util.*;
public class LeapYear{
    static boolean check(int y){
        return y>=1582 && (y%4==0 && y%100!=0 || y%400==0);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int y=sc.nextInt();
        System.out.println(check(y)?"Leap Year":"Not Leap Year");
    }
}
