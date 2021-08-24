import java.io.*;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
class Doctor
{

    public void Doct()

    {



            try
            {
                Scanner input = new Scanner(System.in);
                System.out.print("name:-");
                String dname = input.nextLine();
                System.out.print("specilization:-");
                String specilist = input.nextLine();
                System.out.print("work time:-");
                String appoint = input.nextLine();
                System.out.print("qualification:-");
                String doc_qual = input.nextLine();
                System.out.print("room no.:-");
                String droom = input.nextLine();

                // create a mysql database connection
                //String myDriver = "com.mysql.cj.jdbc.Driver";

                String myUrl = "jdbc:mysql://localhost:3306/HospitalMS";
                String user="root";
                String pass="8883543506";
                //Class.forName(myDriver);
                Connection conn = DriverManager.getConnection(myUrl,user,pass);

                Statement st = conn.createStatement();

                // note that i'm leaving "date_created" out of this insert statement
                st.executeUpdate("INSERT INTO doctor ( name, specilist, work_time, qualification, room_no) "
                        +"VALUES ( '"+dname+"' , '"+specilist+"', '"+appoint+"', '"+doc_qual+"', '"+droom+"')");

                conn.close();
                System.out.println("inserted sucessfully");
            }
            catch (Exception e)
            {
                System.err.println("Got an exception!");
                System.err.println(e.getMessage());
            }





    }

}