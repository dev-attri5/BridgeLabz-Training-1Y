package Gla.strings.level3;

import java.util.*;
public class BMIProgram {
    static String status(double bmi){
        if(bmi<18.5) return "Underweight";
        if(bmi<25) return "Normal";
        if(bmi<30) return "Overweight";
        return "Obese";
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=10;i++){
            double weight=sc.nextDouble();
            double height=sc.nextDouble()/100.0;
            double bmi=weight/(height*height);
            System.out.println(weight+" "+(height*100)+" "+bmi+" "+status(bmi));
        }
    }
}
