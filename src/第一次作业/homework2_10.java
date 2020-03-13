package 第一次作业;

import java.util.Scanner;

public class homework2_10 {
    public static final int FIRST_DAY = 4;
    public static final int YEAR = 2009;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month;

        System.out.println("Enter month:");
        month = in.nextInt();
        printMenology(YEAR,month);
    }

    private static void printMenology(int year, int month) {
        int allDays,firstDay,day;
        allDays = getDays(year,month);
        firstDay = getStartPosition(year,month);
        printHead();
        for(int i=0;i<firstDay;i++)
        {
            System.out.println("             ");
        }
        day = firstDay;
        for(int i=1;i<allDays;i++)
        {
            System.out.printf("%5d",i);
            day = (day+1)%7;
            if(day==0)System.out.println();
        }
    }

    private static void printHead() {
        System.out.printf(" SUN MON TUE WED THU FRI STA");
    }

    private static int getStartPosition(int year, int month) {
        int allDays,firstDay;
        allDays = 0;
        for(int i=0;i<month;i++)
        {
           allDays+=getDays(year,i);
        }
        firstDay = (allDays+FIRST_DAY)%7;
        return  firstDay;
    }

    private static int getDays(int year, int month) {
        int days;
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 12: days = 31;break;
            case 4:
            case 6:
            case 9:
            case 11: days = 30;break;
            case 2:
                if(year%400==0||year%4==0&&year%100!=0){
                    days = 29;
                }else{
                    days = 28;
                }
                break;
            default:
                days =-1;
        }
        return days;
    }
}
