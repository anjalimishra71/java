import java.util.*;
class calYearMonthRemWeekHours{
    public static void main(String args[]){
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number..");
        num=sc.nextInt();
        int year,month,days,week,hour;
        year=num/365;
        month=(num%365)/30;
        days=(num%365)%30;
        week=num/7;
        hour=num*24;
        System.out.println("years= "+year);
        System.out.println("months= "+month);
        System.out.println("days= "+days);
        System.out.println("week= "+week);
        System.out.println("hour= "+hour);


    }
}