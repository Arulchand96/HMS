package utility;

import java.util.Calendar;
import java.text.*;
import java.util.*;


public class DateUtility {

    //1. Method to return the last date of the month from given date string(Format: MM/dd/yyyy)
    public static Date lastDate(String stringDate) throws Exception {
        Date date1 = getStringToDate(stringDate);
        Calendar c = Calendar.getInstance();
        c.setTime(date1);
        c.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
        return c.getTime();
    }

    //2. Method to return the first date of the month from given date string(Format: MM/dd/yyyy)
    public static Date firstDate(String stringDate) throws Exception {
        Date date1 = getStringToDate(stringDate);
        Calendar c = Calendar.getInstance();
        c.setTime(date1);
        c.set(Calendar.DAY_OF_MONTH, c.getActualMinimum(Calendar.DAY_OF_MONTH));
        return c.getTime();
    }

    //3. Method to return the difference of two date in Day Hr Min Sec format
    static String findDifference(Date startDate, Date endDate) {
        long difference_In_Time = endDate.getTime() - startDate.getTime();
        StringBuilder sb1 = new StringBuilder("");

        long difference_In_Days = (difference_In_Time / (1000 * 60 * 60 * 24)) % 365;
        if (difference_In_Days > 0) {
            long days=new Long(difference_In_Days);
            sb1.append(days + "day  ");
        }
        long difference_In_Hours = (difference_In_Time / (1000 * 60 * 60)) % 24;
        if (difference_In_Hours > 0) {
            long hours=new Long(difference_In_Hours);
            sb1.append(hours + "hrs  ");
        }
        long difference_In_Minutes = (difference_In_Time / (1000 * 60)) % 60;
        if (difference_In_Minutes > 0) {
            long minutes=new Long(difference_In_Minutes);
            sb1.append(minutes + "mins  ");
        }
        long difference_In_Seconds = (difference_In_Time / 1000) % 60;
        if (difference_In_Seconds > 0) {
            long seconds=new Long(difference_In_Seconds);
            sb1.append(seconds + "seconds");
        }

        String stringFormat=sb1.toString();

        return stringFormat;
    }

    //4. Method to return by add 1 hour to given date.
    public static Date addOneHour(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.HOUR_OF_DAY, 1);
        Date date1 = cal.getTime();
        return date1;
    }

    //5. Method to return by sub 1 hour to given date.
    public static Date subOneHour(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.HOUR_OF_DAY, -1);
        Date date1 = cal.getTime();
        return date1;
    }

    //6. Method to return by add 1 day to given date.
    public static Date addOneDay(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, 1);
        Date date1 = cal.getTime();
        return date1;
    }

    //7. Method to return by sub 1 day to given date.
    public static Date subOneDay(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, -1);
        Date date1 = cal.getTime();
        return date1;
    }

    //8. Method to return current day.
    public static int curDay() {
        Calendar calendar = Calendar.getInstance();
        return calendar.get(Calendar.DATE);
    }

    //9. Method to return current month
    public static int curMonth() {
        Calendar calendar = Calendar.getInstance();
        return calendar.get(Calendar.MONTH);
    }

    //10. Method to return current year.
    public static int curYear() {
        Calendar calendar = Calendar.getInstance();
        return calendar.get(Calendar.YEAR);
    }

    //11. Method to return current date.
    public static Date curIntDate() {
        Calendar calendar = Calendar.getInstance();
        return calendar.getTime();
    }

    //12. Method to return current date in string format(MM/dd/yyyy)
    public static String currentSringDate() {
        return new SimpleDateFormat("MM/dd/yyyy").format(Calendar.getInstance().getTime());
    }

    //13. Method to return by converting the date to string format(MM/dd/yyyy)
    public static String convertDateToString(Date date) {
        if (date == null) {
            date = Calendar.getInstance().getTime();
        }
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        String dateToString = dateFormat.format(date);
        return dateToString;
    }

    //14. Method to return by converting the String(MM/dd/yyyy) to date
    public static Date getStringToDate(String stringDate) {
        Date date1 = null;
        try {
            date1 = new SimpleDateFormat("MM/dd/yyyy").parse(stringDate);
        } catch (Exception e) {
            date1 = Calendar.getInstance().getTime();
        }
        return date1;
    }

    //15. Method to return by converting the date string(MM/dd/yyyy) to string format(August 10, 2021)
    public static String getStringToString1(String oldString) {
        String newString = null;
        try {
            SimpleDateFormat dt = new SimpleDateFormat("MM/dd/YYYY");
            Date date = dt.parse(oldString);
            SimpleDateFormat dt1 = new SimpleDateFormat("MMMMMM dd, YYYY");
            newString = dt1.format(date);
        } catch (Exception e) {
        }
        return newString;
    }

    //16. Method to return the last date of the year from given date string(Format: MM/dd/yyyy)
    public static Date lastDateOfYear(String stringDate) {
        Date date1 = getStringToDate(stringDate);
        Calendar c = Calendar.getInstance();
        c.setTime(date1);
        c.set(Calendar.DAY_OF_YEAR, c.getActualMaximum(Calendar.DAY_OF_YEAR));
        Date date3 = c.getTime();
        return date3;
    }

    //17. Method to return the first date of the year from given date string(Format: MM/dd/yyyy)
    public static Date firstYear(String stringDate) {
        Date date1 = getStringToDate(stringDate);
        Calendar c = Calendar.getInstance();
        c.setTime(date1);
        c.set(Calendar.DAY_OF_YEAR, c.getActualMinimum(Calendar.DAY_OF_YEAR));
        Date date2 = c.getTime();
        return date2;
    }

    //18. Method to return current time as string in 12hrs format
    public static String currentTimeTwelve() {
        return new SimpleDateFormat("hh:mm a").format(Calendar.getInstance().getTime());
    }

    //19. Method to return current time as string in 24hrs format
    public static String currentTimeTwentyFour() {
        return new SimpleDateFormat("HH:mm").format(Calendar.getInstance().getTime());
    }

    //20. Method to return by converting the date string(MM/dd/yyyy) to string format(Aug 10, 2021)
    public static String getStringToString2(String oldString) {
        String newString = null;
        try {
            Date date = new SimpleDateFormat("MM/dd/YYYY").parse(oldString);
            newString = new SimpleDateFormat("MMM dd, YYYY").format(date);
        } catch (Exception e) {
        }
        return newString;
    }

    //21. Method to return list of date in string with in the given date range
    public static List<Date> getDaysBetweenDates(Date startDate, Date endDate)
        {
            List<Date> dates = new ArrayList<Date>();
            Calendar calendar = new GregorianCalendar();
            calendar.setTime(startDate);

            while (calendar.getTime().before(endDate))
            {
                Date result = calendar.getTime();
                dates.add(result);
                calendar.add(Calendar.DATE, 1);
            }
            return dates;
    }

    //22. Method to return date as string from the given date and the required format
    public static String getDateFormat(Date date, String dateFormat) {
        DateFormat formatter = new SimpleDateFormat(dateFormat);
        return formatter.format(date);
    }

    //23. Method to return by add the given hour to given date.
    public static Date addOneHourByGivenDateAndHour(Date date, int hour) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.HOUR_OF_DAY, hour);
        Date date5 = cal.getTime();
        return date5;
    }

    //24. Method to return by sub the given hour to given date.
    public static Date subOneHourByGivenDateAndHour(Date date, int hour) {
        Calendar cal = Calendar.getInstance();
        //date= getStringToDate(stringDate);
        cal.setTime(date);
        cal.add(Calendar.HOUR_OF_DAY, -hour);
        Date date5 = cal.getTime();
        return date5;
    }

    //25. Method to return by add the given day to given date.
    public static Date addOneDayByGivenDateAndHour(Date date, int day) {
        Calendar cal = Calendar.getInstance();
        //date= getStringToDate(stringDate);
        cal.setTime(date);
        cal.add(Calendar.DATE, day);
        Date date5 = cal.getTime();
        return date5;
    }

    //26. Method to return by sub the given day to given date.
    public static Date subOneDayByGivenDateAndHour(Date date, int day) {
        Calendar cal = Calendar.getInstance();
        //date= getStringToDate(stringDate);
        cal.setTime(date);
        cal.add(Calendar.DATE, -day);
        Date date5 = cal.getTime();
        return date5;
    }

    //27. Method to return the given date string and time string to date
    public static Date getStringToDateAndTime(String stringDate) {
        Date date1 = null;
        try {
            date1 = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss").parse(stringDate);
        } catch (Exception e) {
            date1 = Calendar.getInstance().getTime();
        }
        return date1;
    }

    //28. Method to return date without time
    public static Date getDateWithoutTime(String stringDate) {
        Date date1 = null;
        try {
            date1 = new SimpleDateFormat("MM/dd/yyyy").parse(stringDate);
        } catch (Exception e) {
            date1 = Calendar.getInstance().getTime();
        }
        return date1;
    }

}