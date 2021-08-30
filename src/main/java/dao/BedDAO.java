package dao;

import entity.Bed;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BedDAO {
    List<Bed> saveBed() {

        List<Bed> beds = new ArrayList<Bed>();

        String myUrl = "jdbc:mysql://localhost:3306/HospitalMS?useSSL=false";
        String user = "root";
        String pass = "8883543506";

        try {

            // create a mysql database connection
            //String myDriver = "com.mysql.cj.jdbc.Driver";


            //Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, user, pass);

            Statement st = conn.createStatement();

            st.executeUpdate("INSERT INTO bed ( bedid, bedtype, roomname ) "
                    + "VALUES ('"+beds.get(1)+"','"+beds.get(2)+"','"+beds.get(3)+"')");
            Bed bed=new Bed();
            beds.add(bed);


            conn.close();
            System.out.println("inserted sucessfully");
        } catch (Exception e) {
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
        }
        finally {
            return beds;
        }

    }
}
