import java.io.*;
import java.sql.*;
import java.util.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Patient {

    public void Pat() {


        try {
            Scanner input = new Scanner(System.in);

            System.out.print("name:-");
            String pname = input.nextLine();
            System.out.print("disease:-");
            String disease = input.nextLine();
            System.out.print("sex:-");
            String sex = input.nextLine();
            System.out.print("admit_status:-");
            String admit_status = input.nextLine();
            System.out.print("age:-");
            int age = input.nextInt();
            // create a mysql database connection
            //String myDriver = "com.mysql.cj.jdbc.Driver";

            String myUrl = "jdbc:mysql://localhost:3306/HospitalMS";
            String user = "root";
            String pass = "8883543506";
            //Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, user, pass);

            Statement st = conn.createStatement();

            // note that i'm leaving "date_created" out of this insert statement
            st.executeUpdate("INSERT INTO patient ( name, disease, sex, admit_status,age) "
                    + "VALUES ('"+pname+"','"+disease+"','"+sex+"','"+admit_status+"','"+age+"')");

            conn.close();
            System.out.println("inserted sucessfully");
        } catch (Exception e) {
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
        }


    }

}
