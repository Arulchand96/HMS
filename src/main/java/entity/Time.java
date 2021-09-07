package entity;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class Time {

    public static void currentTimeTwelve() {

        Calendar calendar = Calendar.getInstance();
        System.out.println("Current Time in 12Hrs: " + calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND));


    }

    public void currentTimeTwentyFour() {

        currentTimeTwelve();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String curTime=dtf.format(now);

        System.out.println("Time"+curTime);
    }



}
