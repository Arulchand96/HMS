package utility;

import java.util.Scanner;
import java.time.format.DateTimeFormatter;

public class UtilityTest {

    public static void main(String args[]) throws Exception {

        System.out.println(DateUtility.curIntDate());
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
        System.out.println("Date Format:"+DateUtility.getStringToDate(stringDate));



    }
}
