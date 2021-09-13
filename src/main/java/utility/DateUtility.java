package utility;

import java.util.Calendar;
import java.text.*;
import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;


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

    public static String convertDateToString(Date date) {
        if (date == null) {
            date = Calendar.getInstance().getTime();
        }
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        String dateToString = dateFormat.format(date);

        return dateToString;

    }

    public static Date convertStringToDate(String stringDate) {

        Date date1 = null;

        try {

            date1 = new SimpleDateFormat("MM/dd/yyyy").parse(stringDate);
        } catch (Exception e) {

            date1 = Calendar.getInstance().getTime();

        }

        return date1;
    }

    public static Date lastDate(String stringDate) throws Exception {

        //Date date1=new SimpleDateFormat("MM/dd/yyyy").parse(stringDate);
        Date date1 = getStringToDate(stringDate);

        Calendar c = Calendar.getInstance();
        c.setTime(date1);
        c.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
        return c.getTime();
    }

    public static Date firstDate(String stringDate) throws Exception {

        Date date1 = getStringToDate(stringDate);
        Calendar c = Calendar.getInstance();
        c.setTime(date1);
        c.set(Calendar.DAY_OF_MONTH, c.getActualMinimum(Calendar.DAY_OF_MONTH));
        return c.getTime();
    }

    public static Date firstYear(String stringDate) {

        Date date1 = getStringToDate(stringDate);
        Calendar c = Calendar.getInstance();
        c.setTime(date1);
        c.set(Calendar.DAY_OF_YEAR, c.getActualMinimum(Calendar.DAY_OF_YEAR));
        Date date2 = c.getTime();
        return date2;
    }

    public static Date lastDateOfYear(String stringDate) {

        Date date1 = getStringToDate(stringDate);
        Calendar c = Calendar.getInstance();
        c.setTime(date1);
        c.set(Calendar.DAY_OF_YEAR, c.getActualMaximum(Calendar.DAY_OF_YEAR));
        Date date3 = c.getTime();
        return date3;
    }

    public static String getStringToString1(String oldString) {

        String newString = null;

        try {
            SimpleDateFormat dt = new SimpleDateFormat("MM/dd/YYYY");
            Date date = dt.parse(oldString);
            SimpleDateFormat dt1 = new SimpleDateFormat("MMMMMM dd, YYYY");
            newString = dt1.format(date);
        } catch (Exception e) {

            //date1=Calendar.getInstance().getTime();

        }
        return newString;

    }

    public static String getStringToString2(String oldString) {

        String newString = null;

        try {

            Date date = new SimpleDateFormat("MM/dd/YYYY").parse(oldString);

            newString = new SimpleDateFormat("MMM dd, YYYY").format(date);

        } catch (Exception e) {

            //date1=Calendar.getInstance().getTime();

        }
        return newString;
    }

    public static Date addOneHour(Date date) {

        Calendar cal = Calendar.getInstance();
        //date= getStringToDate(stringDate);
        cal.setTime(date);
        cal.add(Calendar.HOUR_OF_DAY, 1);
        Date date1 = cal.getTime();

        return date1;

    }

    public static Date subOneHour(Date date) {

        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.HOUR_OF_DAY, -1);
        Date date1 = cal.getTime();

        return date1;

    }

    public static Date addOneDay(Date date) {

        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, 1);
        Date date1 = cal.getTime();

        return date1;

    }

    public static Date subOneDay(Date date) {

        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, -1);
        Date date1 = cal.getTime();

        return date1;

    }

    public static Date getStringToDate(String stringDate) {

        Date date1 = null;

        try {

            date1 = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss").parse(stringDate);
        } catch (Exception e) {

            date1 = Calendar.getInstance().getTime();

        }

        return date1;
    }


    static long[] findDifference(Date startDate,Date endDate) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

            long difference_In_Time = startDate.getTime() - endDate.getTime();

            long difference_In_Days = (difference_In_Time / (1000 * 60 * 60 * 24)) % 365;

            long difference_In_Hours = (difference_In_Time / (1000 * 60 * 60)) % 24;

            long difference_In_Minutes = (difference_In_Time / (1000 * 60)) % 60;

            long difference_In_Seconds = (difference_In_Time / 1000) % 60;

            long result[]=new long[4];

        result[0] = difference_In_Days;
        result[1] = difference_In_Hours;
        result[2] = difference_In_Minutes;
        result[3] = difference_In_Seconds;

           // System.out.println(difference_In_Days + " days, " + difference_In_Hours + " hours, " + difference_In_Minutes + " minutes, " + difference_In_Seconds + " seconds");
            return result;






    }
}