package dao;

import buisnessobject.InPatientBO;
import buisnessobject.PatientBO;
import entity.Doctor;
import entity.Patient;
import entity.Visitor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.time.LocalDateTime;

public class PatientDAO {

    String myUrl = "jdbc:mysql://localhost:3306/HospitalMS?useSSL=false";
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
            st.executeUpdate("INSERT INTO patient ( name, dob, phoneno, type) "
                    + "VALUES ('"+patient.getPname()+"','"+patient.getDob()+"','"+patient.getPhoneno()+"','"+patient.getType()+"')");

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
                patient.setDob(resultSet.getString(3));
                patient.setPhoneno(resultSet.getString(4));
                patient.setType(resultSet.getString(5));
                p.add(patient);

                //System.out.format("%s, %s, %s, %s, %s, %s\n", 1,5);

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
    public void update(int patient) {


        try {

            // create a mysql database connection
            //String myDriver = "com.mysql.cj.jdbc.Driver";


            //Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, user, pass);

            Statement st = conn.createStatement();


            // note that i'm leaving "date_created" out of this insert statement
            st.executeUpdate("update patient set type='IP' where id="+patient+"");

            conn.close();
            //System.out.println("inserted sucessfully");
        } catch (Exception e) {
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
        }

    }
    public void insertIpPatient(int patient,long identity,int bedid ) {


        try {

            // create a mysql database connection
            //String myDriver = "com.mysql.cj.jdbc.Driver";


            //Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, user, pass);

            Statement st = conn.createStatement();


            // note that i'm leaving "date_created" out of this insert statement
            st.executeUpdate("INSERT INTO ip_patient ( patientid, identificationno, bedid) "
                    + "VALUES ('"+patient+"','"+identity+"','"+bedid+"')");

            conn.close();
            System.out.println("Room booked for IP patients");
        } catch (Exception e) {
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
        }

    }

    public void reportOne(long idR,String pnameR) {


        //List<Patient> p = new ArrayList<Patient>();

        try {


            Connection conn = DriverManager.getConnection(myUrl, user, pass);

            Patient patient = new Patient();

            String query = "SELECT * FROM patient where id=" + idR + " or name='" + pnameR + "';";

            Statement st = conn.createStatement();


            ResultSet resultSet = st.executeQuery(query);


            while (resultSet.next()) {

                //PatientBO patientBO=new PatientBO();
                //patientBO.viewPatient();

                //Patient patient = new Patient();
                patient.setId(resultSet.getLong(1));
                patient.setPname(resultSet.getString(2));
                patient.setDob(resultSet.getString(3));
                patient.setPhoneno(resultSet.getString(4));
                patient.setType(resultSet.getString(5));

                //print the results

                //


                // p.add(patient);""

            }

            System.out.format("%s, %s, %s, %s, %s\n", patient.getId(), patient.getPname(), patient.getDob(), patient.getPhoneno(), patient.getType());


            //System.out.println("hi");


            st.close();
            conn.close();
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        } /*finally {
            return p;
        }*/
    }

    public void reportSix() {


        //List<Patient> p = new ArrayList<Patient>();

        try {


            Connection conn = DriverManager.getConnection(myUrl, user, pass);

            Patient patient = new Patient();

            String query = "SELECT * FROM patient where type='IP';";

            Statement st = conn.createStatement();


            ResultSet resultSet = st.executeQuery(query);


            while (resultSet.next()) {

                //PatientBO patientBO=new PatientBO();
                //patientBO.viewPatient();

                //Patient patient = new Patient();
                patient.setId(resultSet.getLong(1));
                patient.setPname(resultSet.getString(2));
                patient.setDob(resultSet.getString(3));
                patient.setPhoneno(resultSet.getString(4));
                patient.setType(resultSet.getString(5));

                //print the results

                System.out.format("%s, %s, %s, %s, %s\n", patient.getId(), patient.getPname(), patient.getDob(), patient.getPhoneno(), patient.getType());


                // p.add(patient);""

            }

            //System.out.format("%s, %s, %s, %s, %s\n", patient.getId(), patient.getPname(), patient.getDob(), patient.getPhoneno(), patient.getType());


            //System.out.println("hi");


            st.close();
            conn.close();
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        } /*finally {
            return p;
        }*/
    }

    public void reportSeven() {


        //List<Patient> p = new ArrayList<Patient>();

        try {


            Connection conn = DriverManager.getConnection(myUrl, user, pass);

            Patient patient = new Patient();

            String query = "SELECT * FROM patient where type='OP';";

            Statement st = conn.createStatement();


            ResultSet resultSet = st.executeQuery(query);


            while (resultSet.next()) {

                //PatientBO patientBO=new PatientBO();
                //patientBO.viewPatient();

                //Patient patient = new Patient();
                patient.setId(resultSet.getLong(1));
                patient.setPname(resultSet.getString(2));
                patient.setDob(resultSet.getString(3));
                patient.setPhoneno(resultSet.getString(4));
                patient.setType(resultSet.getString(5));

                //print the results

                //
                System.out.format("%s, %s, %s, %s, %s\n", patient.getId(), patient.getPname(), patient.getDob(), patient.getPhoneno(), patient.getType());


                // p.add(patient);""

            }

            //System.out.format("%s, %s, %s, %s, %s\n", patient.getId(), patient.getPname(), patient.getDob(), patient.getPhoneno(), patient.getType());


            //System.out.println("hi");


            st.close();
            conn.close();
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        } /*finally {
            return p;
        }*/
    }

    public void reportEight(String date) {


        //List<Patient> p = new ArrayList<Patient>();

        try {


            Connection conn = DriverManager.getConnection(myUrl, user, pass);

            Patient patient = new Patient();

            String query = "SELECT * FROM visitor where visitdate='" +date+ "';";

            Statement st = conn.createStatement();


            ResultSet resultSet = st.executeQuery(query);


            while (resultSet.next()) {

                Visitor visitor=new Visitor();


                visitor.setId(resultSet.getLong(1));
                visitor.setPid(resultSet.getLong(2));
                visitor.setDid(resultSet.getLong(3));
                visitor.setDoctor_reccommend(resultSet.getString(4));
                visitor.setMedicine(resultSet.getString(5));
                visitor.setFollowup(resultSet.getBoolean(6));
                visitor.setVisitdate(resultSet.getString(7));

                System.out.format("%s, %s, %s, %s, %s, %s, %s\n", visitor.getId(), visitor.getPid(), visitor.getDid(), visitor.getDoctor_reccommend(), visitor.getMedicine(), visitor.getFollowup(),visitor.getVisitdate());

            }




            //System.out.println("hi");


            st.close();
            conn.close();
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }


    }

}

