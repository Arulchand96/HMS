package dao;

import entity.Appointment_status;
import entity.Hospital;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class Appointment_statusDAO {
    String myUrl = "jdbc:mysql://localhost:3306/HospitalMS?useSSL=false";
    String user = "root";
    String pass = "8883543506";

    public void save(Appointment_status appointment_status) {


        try {

            Connection conn = DriverManager.getConnection(myUrl, user, pass);

            Statement st = conn.createStatement();

            // note that i'm leaving "date_created" out of this insert statement
            st.executeUpdate("INSERT INTO appointment ( patient_id, date_of_visit, purpose_of_visit, BP, temperature, doctor_visit, is_firstvisit) "
                    + "VALUES ('" + appointment_status.getPid() + "','" + appointment_status.getDate_of_visit() + "','" + appointment_status.getPurpose_of_visit() + "','" + appointment_status.getBp() + "','" +appointment_status.getTemperature() + "','" + appointment_status.getDoctor_visit() + "','" + appointment_status.getIs_firstvisit() + "' )");

          /*  if(appointment_status.getIs_firstvisit() >3) {

                st.executeUpdate("INSERT INTO ip_patient ( patient_id , ip_identification_number) " + "VALUES ('" + appointment_status.getPatient_id() + "','" + appointment_status.getIp_identification_number() + "')");

            }*/


            conn.close();
            System.out.println("inserted sucessfully");
        } catch (Exception e) {
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
        }

    }
    public List<Appointment_status> find() {



        List<Appointment_status> a = new ArrayList<Appointment_status>();

        try {

            Connection conn = DriverManager.getConnection(myUrl, user, pass);

            String query = "SELECT * FROM appointment";

            Statement st = conn.createStatement();


            ResultSet resultSet = st.executeQuery(query);





//
            while (resultSet.next()) {

                Appointment_status appointment_status=new Appointment_status();
                appointment_status.setAid(resultSet.getLong(1));
                appointment_status.setPid(resultSet.getLong(2));
                appointment_status.setDate_of_visit(resultSet.getString(3));
                appointment_status.setPurpose_of_visit(resultSet.getString(4));
                appointment_status.setBp(resultSet.getString(5));
                appointment_status.setTemperature(resultSet.getString(6));
                appointment_status.setDoctor_visit(resultSet.getString(7));
                appointment_status.setIs_firstvisit(resultSet.getInt(8));
                a.add(appointment_status);

            }




            st.close();
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
        finally {
            return a;
        }
    }
}
