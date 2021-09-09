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
        if(date==null) {
            date = Calendar.getInstance().getTime();
        }
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        String dateToString = dateFormat.format(date);

        return dateToString;

    }

    public static Date getStringToDate(String stringDate)   {

        Date date1=null;

        try {

             date1 = new SimpleDateFormat("MM/dd/yyyy").parse(stringDate);
        }
        catch(Exception e) {

            date1=Calendar.getInstance().getTime();

        }

        return date1;
    }

    public static  Date lastDate(String stringDate) throws Exception {

        //Date date1=new SimpleDateFormat("MM/dd/yyyy").parse(stringDate);
        Date date1=getStringToDate(stringDate);

        Calendar c = Calendar.getInstance();
        c.setTime(date1);
        c.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
        return c.getTime();
    }

    public static  Date firstDate(String stringDate) throws Exception {

        Date date1=getStringToDate(stringDate);
        Calendar c = Calendar.getInstance();
        c.setTime(date1);
        c.set(Calendar.DAY_OF_MONTH, c.getActualMinimum(Calendar.DAY_OF_MONTH));
        return c.getTime();
    }


}


