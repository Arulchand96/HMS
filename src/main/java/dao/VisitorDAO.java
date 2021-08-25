package dao;

import entity.Visitor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class VisitorDAO {
    String myUrl = "jdbc:mysql://localhost:3306/HospitalMS?useSSL=false";
    String user = "root";
    String pass = "8883543506";

    public void save(Visitor visitor) {


        try {

            Connection conn = DriverManager.getConnection(myUrl, user, pass);

            Statement st = conn.createStatement();

            // note that i'm leaving "date_created" out of this insert statement
            st.executeUpdate("INSERT INTO visitor ( visitor_id, patient_id, doctor_id, doctor_reccomend, medicine) "
                    + "VALUES ('" + visitor.getVid() + "','" + visitor.getPid() + "','" + visitor.getDid() + "','" + visitor.getDoctor_reccommend() + "','" +visitor.getMedicine() + "')");

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
    public List<Visitor> find() {



        List<Visitor> v = new ArrayList<Visitor>();

        try {

            Connection conn = DriverManager.getConnection(myUrl, user, pass);

            String query = "SELECT * FROM visitor";

            Statement st = conn.createStatement();


            ResultSet resultSet = st.executeQuery(query);





//
            while (resultSet.next()) {

                Visitor visitor=new Visitor();
                visitor.setVid(resultSet.getLong(1));
                visitor.setPid(resultSet.getLong(2));
                visitor.setDid(resultSet.getLong(3));
                visitor.setDoctor_reccommend(resultSet.getString(4));
                visitor.setMedicine(resultSet.getString(5));
                v.add(visitor);

            }




            st.close();
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
        finally {
            return v;
        }
    }
}
