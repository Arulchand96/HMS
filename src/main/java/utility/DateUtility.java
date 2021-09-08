package utility;

import entity.Time;

import java.util.Calendar;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.text.*;
import java.util.*;


public class DateUtility {

    public void dislayDate(int displayDate) {
        System.out.println("1.Current date:"+displayDate);
    }


    public static int curDay(int day) {

        return day;
    }

    public void dislayMonth(int displayMonth) {
        System.out.println("2.Current Month:"+displayMonth);
    }

    public static int curMonth(int month) {

        return month;
    }

    public void dislayYear(int displayYear) {
        System.out.println("3.Current Year:"+displayYear);
    }

    public static int curYear(int year) {

        return year;
    }

    public void dislayStringDate(String displayString) {
        System.out.println("4.Display Date in Integer Type:"+displayString);
    }

    public static String curDate(String date) {

        return date;
    }
    public void dislayIntDate(int displayInt) {
        System.out.println("5.Display Date in Integer Type:"+displayInt);
    }

    public static int curIntDate(int dateInt) {

        return dateInt;
    }
    public void dislayTimeTwelve(String displayTimeTwelve) {
        System.out.println("6.Display Time in 12 Hours Format:"+displayTimeTwelve);
    }

    public static String timeTwelve(String timeTwelveString) {

        return timeTwelveString;
    }

    public void dislayTimeTwentyFour(String displayTimeTwentyFour) {
        System.out.println("7.Display Time in 24 Hours Format:"+displayTimeTwentyFour);
    }

    public static String timeTwentyFour(String timeTwentyFourString) {

        return timeTwentyFourString;
    }




    public static void main(String args[]) {

        DateUtility dateUtility=new DateUtility();
        Calendar calendar = Calendar.getInstance();

        int day=calendar.get(Calendar.DATE);
        int displayDate=curDay(day);
        dateUtility.dislayDate(displayDate);

        //java.text.SimpleDateFormat df1 = new java.text.SimpleDateFormat("MM");
        //int month=df1.format(calendar.getTime());
        int month=calendar.get(calendar.MONTH) + 1;
        int displayMonth=curMonth(month);
        dateUtility.dislayMonth(displayMonth);

        int year=calendar.get(calendar.YEAR);
        int displayYear=curYear(year);
        dateUtility.dislayYear(displayYear);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDateTime now = LocalDateTime.now();
        String date=dtf.format(now);
        String displayString=curDate(date);
        dateUtility.dislayStringDate(displayString);

        int yearInt = calendar.get(Calendar.YEAR);
        int monthInt = calendar.get(Calendar.MONTH) + 1;
        int dayInt = calendar.get(Calendar.DAY_OF_MONTH);
        int calcDate = yearInt * 100 + monthInt;
        int dateInt = calcDate * 100 + dayInt;
        int displayInt=curIntDate(dateInt);
        dateUtility.dislayIntDate(displayInt);

        DateFormat dateFormat = new SimpleDateFormat("hh.mm aa");
        String timeTwelveString = dateFormat.format(new Date()).toString();
        String diplayTimeTwelve=timeTwelve(timeTwelveString);
        dateUtility.dislayTimeTwelve(diplayTimeTwelve);
        //System.out.println("Current time in AM/PM: "+dateString);


        DateTimeFormatter dtfTime = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime nowTime = LocalDateTime.now();
        String timeTwentyFourString=dtfTime.format(nowTime);
        String displayTimeTwentyFour=timeTwelve(timeTwentyFourString);
        dateUtility.dislayTimeTwentyFour(displayTimeTwentyFour);











    }
}