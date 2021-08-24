import java.io.*;
import java.sql.*;
import java.util.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Appointment_status {

    public void appoint() {


        try {

            Scanner input = new Scanner(System.in);
            System.out.print("Patient id:-");
            String pid = input.nextLine();
            System.out.print("Date of visit-");
            String date_of_visit = input.nextLine();
            System.out.print("Purpose of visit:-");
            String purpose_of_visit = input.nextLine();
            System.out.print("bp:-");
            int bp = input.nextInt();
            System.out.print("Temperature:-");
            int Temperature = input.nextInt();
            System.out.print("Doctor visit:-");
            String Dotor_visit = input.nextLine();
            System.out.print("is firstvisit:-");
            int is_firstvisit = input.nextInt();
            // create a mysql database connection
            //String myDriver = "com.mysql.cj.jdbc.Driver";

            String myUrl = "jdbc:mysql://localhost:3306/HospitalMS";
            String user = "root";
            String pass = "8883543506";
            //Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, user, pass);

            Statement st = conn.createStatement();

            // note that i'm leaving "date_created" out of this insert statement
            st.executeUpdate("INSERT INTO appointment ( patient_id, date_of_visit, purpose_of_visit, BP, temperature, doctor_visit, is_firstvisit) "
                    + "VALUES ('"+pid+"','"+date_of_visit+"','"+purpose_of_visit+"','"+bp+"','"+Temperature+"','"+Dotor_visit+"','"+is_firstvisit+"' )");

            conn.close();
            System.out.println("inserted sucessfully");
        } catch (Exception e) {
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
        }


    }

}

