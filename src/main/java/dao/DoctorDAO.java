package dao;

import entity.Appointment_status;
import entity.Doctor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DoctorDAO {

    String myUrl = "jdbc:mysql://localhost:3306/HospitalMS?useSSL=false";
    String user = "root";
    String pass = "8883543506";

    public void save(Doctor doctor) {


        try {

            // create a mysql database connection
            //String myDriver = "com.mysql.cj.jdbc.Driver";


            //Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, user, pass);

            Statement st = conn.createStatement();

            // note that i'm leaving "date_created" out of this insert statement
            st.executeUpdate("INSERT INTO doctor ( name, specilist, work_time, qualification, room_no) "
                    +"VALUES ( '"+doctor.getDname()+"' , '"+doctor.getSpecilist()+"', '"+doctor.getAppoint()+"', '"+doctor.getDoc_qual()+"', '"+doctor.getDroom()+"')");

            conn.close();
            System.out.println("inserted sucessfully");
        } catch (Exception e) {
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
        }

    }

    public List<Doctor> find() {



        List<Doctor> d = new ArrayList<Doctor>();

        try {

            Connection conn = DriverManager.getConnection(myUrl, user, pass);

            String query = "SELECT * FROM doctor;";

            Statement st = conn.createStatement();


            ResultSet resultSet = st.executeQuery(query);






            while (resultSet.next()) {

                Doctor doctor =new Doctor();
                doctor.setId(resultSet.getInt(1));
                doctor.setDname(resultSet.getString(2));
                doctor.setSpecilist(resultSet.getString(3));
                doctor.setDoc_qual(resultSet.getString(4));
                doctor.setAppoint(resultSet.getString(5));
                doctor.setDroom(resultSet.getString(6));
                d.add(doctor);

            }




            st.close();
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
        finally {
            return d;
        }
    }
}
