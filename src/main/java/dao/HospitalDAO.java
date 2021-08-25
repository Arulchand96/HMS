package dao;

import entity.Hospital;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class HospitalDAO {

    String myUrl = "jdbc:mysql://localhost:3306/HospitalMS?useSSL=false";
    String user = "root";
    String pass = "8883543506";

    public void save(Hospital hospital) {

        try {

            // create a mysql database connection
            //String myDriver = "com.mysql.cj.jdbc.Driver";

            //String myUrl = "jdbc:mysql://localhost:3306/HospitalMS";
            //String user = "root";
            //String pass = "8883543506";
            //Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, user, pass);

            Statement st = conn.createStatement();

            // note that i'm leaving "date_created" out of this insert statement
            st.executeUpdate("INSERT INTO hospital ( name, location) "
                    + "VALUES ('"+hospital.getName()+"','"+hospital.getLocation()+"')");


            conn.close();
            System.out.println("inserted sucessfully");
        } catch (Exception e) {
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
        }
    }

    public List<Hospital> find() {



        List<Hospital> h = new ArrayList<Hospital>();

        try {

            Connection conn = DriverManager.getConnection(myUrl, user, pass);

            String query = "SELECT * FROM hospital";

            Statement st = conn.createStatement();


            ResultSet resultSet = st.executeQuery(query);





//
                while (resultSet.next()) {

                    Hospital hospital = new Hospital();
                    hospital.setId(resultSet.getLong(1));
                    hospital.setName(resultSet.getString(2));
                    hospital.setLocation(resultSet.getString(3));
                    h.add( hospital);

                }



                // print the results
                //System.out.format("%s, %s, %s\n", id, name, location);

            st.close();
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
        finally {
            return h;
        }
    }


}
