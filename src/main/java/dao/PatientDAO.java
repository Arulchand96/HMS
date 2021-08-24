package dao;

import entity.Doctor;
import entity.Patient;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PatientDAO {

    String myUrl = "jdbc:mysql://localhost:3306/HospitalMS";
    String user = "root";
    String pass = "8883543506";

    public void save(Patient patient) {


        try {

            // create a mysql database connection
            //String myDriver = "com.mysql.cj.jdbc.Driver";


            //Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, user, pass);

            Statement st = conn.createStatement();

            // note that i'm leaving "date_created" out of this insert statement
            st.executeUpdate("INSERT INTO patient ( name, disease, sex, admit_status,age) "
                    + "VALUES ('"+patient.getPname()+"','"+patient.getDisease()+"','"+patient.getSex()+"','"+patient.getAdmit_status()+"','"+patient.getAge()+"')");

            conn.close();
            System.out.println("inserted sucessfully");
        } catch (Exception e) {
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
        }

    }

    public List<Patient> find() {



        List<Patient> p = new ArrayList<Patient>();

        try {

            Connection conn = DriverManager.getConnection(myUrl, user, pass);

            String query = "SELECT * FROM patient;";

            Statement st = conn.createStatement();


            ResultSet resultSet = st.executeQuery(query);






            while (resultSet.next()) {

                Patient patient=new Patient();
                patient.setId(resultSet.getLong(1));
                patient.setPname(resultSet.getString(2));
                patient.setDisease(resultSet.getString(3));
                patient.setAdmit_status(resultSet.getString(4));
                patient.setSex(resultSet.getString(5));
                patient.setAge(resultSet.getInt(6));
                p.add(patient);

            }




            st.close();
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
        finally {
            return p;
        }
    }
}
