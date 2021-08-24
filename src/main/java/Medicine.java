import java.io.*;
import java.sql.*;
import java.util.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Medicine {

    public void med() {


        try {

            Scanner input = new Scanner(System.in);
            System.out.print("name:-");
            String med_name = input.nextLine();
            System.out.print("comp:-");
            String med_comp = input.nextLine();
            System.out.print("exp_date:-");
            String exp_date = input.nextLine();
            System.out.print("cost:-");
            String med_cost = input.nextLine();
            System.out.print("no of unit:-");
            int count = input.nextInt();

            // create a mysql database connection
            //String myDriver = "com.mysql.cj.jdbc.Driver";

            String myUrl = "jdbc:mysql://localhost:3306/HospitalMS";
            String user = "root";
            String pass = "8883543506";
            //Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, user, pass);

            Statement st = conn.createStatement();

            // note that i'm leaving "date_created" out of this insert statement
            st.executeUpdate("INSERT INTO medicine ( name, comp, exp_date, cost, count) "
                    + "VALUES ('"+med_name+"','"+med_comp+"','"+exp_date+"','"+med_cost+"','"+count+"' )");

            conn.close();
            System.out.println("inserted sucessfully");
        } catch (Exception e) {
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
        }


    }

}

