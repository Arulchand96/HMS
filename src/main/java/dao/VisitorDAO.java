package dao;


import entity.Patient;
import entity.Visitor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;
import java.sql.*;

public class VisitorDAO {
    String myUrl = "jdbc:mysql://localhost:3306/HospitalMS?useSSL=false";
    String user = "root";
    String pass = "8883543506";

    public void save(Visitor visitor) {


        try {

            Connection conn = DriverManager.getConnection(myUrl, user, pass);

            Statement st = conn.createStatement();

            // note that i'm leaving "date_created" out of this insert statement
            st.executeUpdate("INSERT INTO visitor (  patientid, doctorid, doctor_recommend, medicine, follow) "
                    + "VALUES ('" + visitor.getPid() + "','" + visitor.getDid() + "','" + visitor.getDoctor_reccommend() + "','" + visitor.getMedicine() + "','" + visitor.getFollowup() + "',,'" + visitor.getVisitdate() + "')");

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


            while (resultSet.next()) {

                Visitor visitor = new Visitor();
                visitor.setId(resultSet.getLong(1));
                visitor.setPid(resultSet.getLong(2));
                visitor.setDid(resultSet.getLong(3));
                visitor.setDoctor_reccommend(resultSet.getString(4));
                visitor.setMedicine(resultSet.getString(5));
                visitor.setFollowup(resultSet.getBoolean(6));
                visitor.setVisitdate(resultSet.getString(7));
                v.add(visitor);

            }


            st.close();
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        } finally {
            return v;
        }
    }

    public void reportTwo(long pid) {


        //List<Patient> p = new ArrayList<Patient>();

        try {


            Connection conn = DriverManager.getConnection(myUrl, user, pass);

            //Patient patient = new Patient();
            Visitor visitor = new Visitor();

            String query = "SELECT * FROM visitor where patientid=" + pid + ";";

            Statement st = conn.createStatement();


            ResultSet resultSet = st.executeQuery(query);


            while (resultSet.next()) {

                //PatientBO patientBO=new PatientBO();
                //patientBO.viewPatient();

                //Patient patient = new Patient();

                visitor.setId(resultSet.getLong(1));
                visitor.setPid(resultSet.getLong(2));
                visitor.setDid(resultSet.getLong(3));
                visitor.setDoctor_reccommend(resultSet.getString(4));
                visitor.setMedicine(resultSet.getString(5));
                visitor.setFollowup(resultSet.getBoolean(6));
                visitor.setVisitdate(resultSet.getString(7));

                System.out.format("%s, %s, %s, %s, %s, %s\n", visitor.getId(), visitor.getPid(), visitor.getDid(), visitor.getDoctor_reccommend(), visitor.getMedicine(), visitor.getFollowup());

                //print the results

                //


                // p.add(patient);""

            }


            //System.out.println("hi");


            st.close();
            conn.close();
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
    }

    public void reportThree(String from, String to) {
        try {


            Connection conn = DriverManager.getConnection(myUrl, user, pass);

            //Patient patient = new Patient();
            Visitor visitor = new Visitor();

            String query = "SELECT * FROM visitor where visitdate between '"+from+"'  and '"+to+"';";

            Statement st = conn.createStatement();


            ResultSet resultSet = st.executeQuery(query);


            while (resultSet.next()) {
                //System.out.println("hi");

                //PatientBO patientBO=new PatientBO();
                //patientBO.viewPatient();

                //Patient patient = new Patient();

                visitor.setId(resultSet.getLong(1));
                visitor.setPid(resultSet.getLong(2));
                visitor.setDid(resultSet.getLong(3));
                visitor.setDoctor_reccommend(resultSet.getString(4));
                visitor.setMedicine(resultSet.getString(5));
                visitor.setFollowup(resultSet.getBoolean(6));
                visitor.setVisitdate(resultSet.getString(7));

                System.out.format("%s, %s, %s, %s, %s, %s, %s\n", visitor.getId(), visitor.getPid(), visitor.getDid(), visitor.getDoctor_reccommend(), visitor.getMedicine(), visitor.getFollowup(),visitor.getVisitdate());

                //print the results

                //


                // p.add(patient);""

            }
        }
        catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
    }
    public void reportFour(Boolean followup) {
        try {


            Connection conn = DriverManager.getConnection(myUrl, user, pass);

            //Patient patient = new Patient();
            Visitor visitor = new Visitor();

            String query = "SELECT * FROM visitor where follow="+followup+";";

            Statement st = conn.createStatement();


            ResultSet resultSet = st.executeQuery(query);


            while (resultSet.next()) {
                //System.out.println("hi");

                //PatientBO patientBO=new PatientBO();
                //patientBO.viewPatient();

                //Patient patient = new Patient();

                visitor.setId(resultSet.getLong(1));
                visitor.setPid(resultSet.getLong(2));
                visitor.setDid(resultSet.getLong(3));
                visitor.setDoctor_reccommend(resultSet.getString(4));
                visitor.setMedicine(resultSet.getString(5));
                visitor.setFollowup(resultSet.getBoolean(6));
                visitor.setVisitdate(resultSet.getString(7));

                System.out.format("%s, %s, %s, %s, %s, %s, %s\n", visitor.getId(), visitor.getPid(), visitor.getDid(), visitor.getDoctor_reccommend(), visitor.getMedicine(), visitor.getFollowup(),visitor.getVisitdate());

                //print the results

                //


                // p.add(patient);""

            }
        }
        catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
    }
    public void reportFive(long did) {
        try {


            Connection conn = DriverManager.getConnection(myUrl, user, pass);

            //Patient patient = new Patient();
            Visitor visitor = new Visitor();

            String query = "SELECT * FROM visitor where doctorid="+did+";";

            Statement st = conn.createStatement();


            ResultSet resultSet = st.executeQuery(query);




            while (resultSet.next()) {





                    Statement st1 = conn.createStatement();

                    String query1 = "select id,name from patient where id='" + resultSet.getInt(2) + "' ";

                //System.out.println(resultSet.getInt(2));

                    ResultSet resultSet1 = st1.executeQuery(query1);


                    while(resultSet1.next()) {
                        Patient patient=new Patient();
                        patient.setId(resultSet.getLong(1));
                        patient.setPname(resultSet.getString(2));

                        System.out.format("%s, %s\n", patient.getId(),patient.getPname());

                    }
                //System.out.println("hi");

                //PatientBO patientBO=new PatientBO();
                //patientBO.viewPatient();

                //Patient patient = new Patient();



                //print the results

                //


                // p.add(patient);""


            }
            conn.close();
        }
        catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
    }
}