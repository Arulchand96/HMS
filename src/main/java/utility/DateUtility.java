package utility;

import java.util.Calendar;
import java.text.*;
import java.util.*;


public class DateUtility {


    public static Date curIntDate() {
        Calendar calendar = Calendar.getInstance();

        return calendar.getTime();

    }

    public static int curDay() {
        Calendar calendar = Calendar.getInstance();

        return calendar.get(Calendar.DATE);

    }

    public static int curMonth() {
        Calendar calendar = Calendar.getInstance();

        return calendar.get(Calendar.MONTH);

    }

    public static int curYear() {
        Calendar calendar = Calendar.getInstance();
        return calendar.get(Calendar.YEAR);

    }

    public static String currentTimeTwelve() {
        return new SimpleDateFormat("hh:mm a").format(Calendar.getInstance().getTime());
    }

    public static String currentTimeTwentyFour() {
        return new SimpleDateFormat("HH:mm").format(Calendar.getInstance().getTime());
    }

    public static String currentSringDate() {
        return new SimpleDateFormat("MM/dd/yyyy").format(Calendar.getInstance().getTime());
    }

    /*public static String convertDateToString() {

        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");

        Scanner input = new Scanner(System.in);
        System.out.print("Date Format:-");
        Date today = ;
        today = Calendar.getInstance().getTime();

        String reportDateInString = df.format(today);

// Print what date is today!
        //System.out.println("Report Date: " + reportDate);
        return reportDateInString;

    }*/

    public static Date convertStringToDate() {

        Date date=null;

        try {

            Scanner input = new Scanner(System.in);
            input.useDelimiter(",");
            System.out.println("Date In String format");
            String dateString = input.next();
            DateFormat formatter = new SimpleDateFormat("MM/dd/yyyy)");
             date = formatter.parse(dateString);
            //System.out.println(date);
            //sale.setDate(sc.next());

           // return date;
        } catch (Exception e) {
            System.out.println("Given Format is wrong");

        }
        finally
        {
            System.out.println("Thank you for using the program!");
            //return date;
            //so would I need to put a return value of type double here?
        }
        return date;
    }


}







