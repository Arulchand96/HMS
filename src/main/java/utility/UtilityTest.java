package utility;

import java.net.SocketOption;
import java.util.Arrays;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.text.ParseException;

public class UtilityTest {

    public static void main(String args[]) throws Exception {



        /*System.out.println(DateUtility.curIntDate());
        System.out.println(DateUtility.curDay());
        System.out.println(DateUtility.curMonth());
        System.out.println(DateUtility.curYear());
        System.out.println(DateUtility.currentTimeTwelve());
        System.out.println(DateUtility.currentTimeTwentyFour());
        System.out.println(DateUtility.currentSringDate());
        Scanner input= new Scanner(System.in);
        System.out.println("Date Format:");

        //String date=input.next();
        System.out.println("String Format:"+DateUtility.convertDateToString());
        System.out.println("------------------------------------------------------");
        System.out.println("String Format:");
        String stringDate=input.next();
        //DateTimeFormatter format = DateTimeFormatter
                //.ofPattern("MM/dd/yyyy");
        System.out.println("Date Format:"+DateUtility.getStringToDate(stringDate)); */

        // String stringDate ="18/9/2021";
        // Date date2=DateUtility.firstYear(stringDate);
        // System.out.println(date2);
        /*String stringDate="08/10/2015";

        String date1=DateUtility.getStringToString1(stringDate);
        System.out.println(date1);
        Date date=new Date();

        System.out.println(DateUtility.addOneHour(date));
        System.out.println(DateUtility.subOneHour(date));
        System.out.println(DateUtility.addOneDay(date));
        System.out.println(DateUtility.subOneDay(date));*/
        Scanner input=new Scanner(System.in);
        System.out.println("Given Date and Time :");
        String stringDate =input.nextLine();
        Date date1=DateUtility.getStringToDate(stringDate);
        System.out.println("add one hour with given date and time:"+DateUtility.addOneHour(date1));
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Enter the start date and time:");
        String stringDate1=input.nextLine();
        System.out.println("Enter the end date and time:");
        String stringDate2=input.nextLine();
        Date date2=DateUtility.getStringToDate(stringDate1);
        Date date3=DateUtility.getStringToDate(stringDate2);
        DateUtility.findDifference(date2,date3);
        long result[]=DateUtility.findDifference();
        System.out.println(DateUtility.findDifference(Arrays.toString(result[0])) + " days, " + difference_In_Hours + " hours, " + difference_In_Minutes + " minutes, " + difference_In_Seconds + " seconds");


    }
}
