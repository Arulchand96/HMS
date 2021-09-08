package entity;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class CurrentDate {



  /*  String currentDate() {

        java.util.Date date=new java.util.Date();
        System.out.println("Current Date:"+date);



        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDateTime now = LocalDateTime.now();
        String date=dtf.format(now);

        System.out.println("Current Date:"+date);

    }*/

    public void returnCurrentDate() {

        Calendar calendar = Calendar.getInstance();
        String months[] = {
                "Jan",
                "Feb",
                "Mar",
                "Apr",
                "May",
                "Jun",
                "Jul",
                "Aug",
                "Sep",
                "Oct",
                "Nov",
                "Dec"
        };


        System.out.print("Return Current Date: " + months[calendar.get(Calendar.MONTH)] + " " + calendar.get(Calendar.DATE) + " " + calendar.get(Calendar.YEAR));

    }
}
