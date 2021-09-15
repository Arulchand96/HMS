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

        System.out.println("add one hour with given date and time:"+DateUtility.addOneHour(DateUtility.getStringToDateAndTime("11/11/2011 12:12 AM")));
        System.out.println("------------------------------------------------------------------------");
       // System.out.println(DateUtility.g(DateUtility.getStringToDateAndTime("12/11/2012 12:14:12"),DateUtility.getStringToDateAndTime("12/11/2012 12:15:7")));

        //System.out.print(result[0]+"Day ");
        //System.out.print(result[1]+"Hr ");
        //System.out.print(result[2]+"Min ");
       // System.out.print(result[3]+"Sec ");
        //System.out.println(Arrays.toString(result[]));
        System.out.println("------------------------------------------------------------------------");
        DateUtility.addOneHourByGivenDateAndHour(DateUtility.getStringToDateAndTime("12/12/2012 12:14:12"),1);

        System.out.println("------------------------------------------------------------------------");

        //System.out.println(DateUtility.getDatesBetween(DateUtility.getStringToDate("27/08/2010"),DateUtility.getStringToDate("02/09/2010")));
        System.out.println("------------------------------------------------------------------------");
        System.out.println(""+DateUtility.getDateFormat(DateUtility.getStringToDateAndTime("10/12/2012 12:14:12"),"dd/MM/YYYY"));


    }
}
