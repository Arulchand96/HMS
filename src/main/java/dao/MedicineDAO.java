package dao;

import entity.Medicine;
import entity.Patient;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MedicineDAO {

    String myUrl = "jdbc:mysql://localhost:3306/HospitalMS?useSSL=false";
    String user = "root";
    String pass = "8883543506";

    public void save(Medicine medicine ) {


        try {

            // create a mysql database connection
            //String myDriver = "com.mysql.cj.jdbc.Driver";


            //Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, user, pass);

            Statement st = conn.createStatement();

            // note that i'm leaving "date_created" out of this insert statement
            st.executeUpdate("INSERT INTO medicine ( name, comp, exp_date, cost, count) "
                    + "VALUES ('"+medicine.getMed_name()+"','"+medicine.getMed_comp()+"','"+medicine.getExp_date()+"','"+medicine.getMed_cost()+"','"+medicine.getCount()+"' )");

            conn.close();
            System.out.println("inserted sucessfully");
        } catch (Exception e) {
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
        }

    }
    public List<Medicine> find() {



        List<Medicine> m = new ArrayList<Medicine>();

        try {

            Connection conn = DriverManager.getConnection(myUrl, user, pass);

            String query = "SELECT * FROM medicine;";

            Statement st = conn.createStatement();


            ResultSet resultSet = st.executeQuery(query);






            while (resultSet.next()) {

                Medicine medicine=new Medicine();
                medicine.setMed_name(resultSet.getString(1));
                medicine.setMed_comp(resultSet.getString(2));
                medicine.setExp_date(resultSet.getString(3));
                medicine.setMed_cost(resultSet.getString(4));
                medicine.setCount(resultSet.getInt(5));
                m.add(medicine);

            }




            st.close();
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
        finally {
            return m;
        }
    }
}
