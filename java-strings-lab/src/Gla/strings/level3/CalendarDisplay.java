package Gla.strings.level3;

import java.util.*;
import java.time.*;
public class CalendarDisplay{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt(),y=sc.nextInt();
        YearMonth ym=YearMonth.of(y,m);
        System.out.println(ym.getMonth()+" "+y);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        int first=ym.atDay(1).getDayOfWeek().getValue()%7;
        for(int i=0;i<first;i++) System.out.print("    ");
        for(int d=1;d<=ym.lengthOfMonth();d++){
            System.out.printf("%3d ",d);
            if((d+first)%7==0) System.out.println();
        }
    }
}
