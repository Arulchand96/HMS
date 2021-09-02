package dao;

import buisnessobject.InPatientBO;
import buisnessobject.PatientBO;
import entity.Bed;
import entity.InPatient;
import entity.Patient;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class InpatientDAO {


    String myUrl = "jdbc:mysql://localhost:3306/HospitalMS?useSSL=false";
    String user = "root";
    String pass = "8883543506";


    public void iP() {

        //List<InPatientBO> i = new ArrayList<InPatientBO>();
        //System.out.println("Updated successfully");

        try {

            Connection conn = DriverManager.getConnection(myUrl, user, pass);

            Statement st = conn.createStatement();

            //Connection conn = DriverManager.getConnection(myUrl, user, pass);

            String query = "SELECT * FROM patient where type='op'";


            ResultSet resultSet = st.executeQuery(query);

            while (resultSet.next()) {

                Statement st1 = conn.createStatement();

                String query1 = "select * from visitor where patientid='" + resultSet.getInt(1) + "' ";

                ResultSet resultSet1 = st1.executeQuery(query1);

                int i = 0;
                while(resultSet1.next()) {
                    i++;

                }

                //System.out.println(i);

                //System.out.println(resultSet1);

                //resultSet1.getRow();

                //System.out.println(resultSet1.getRow());


               // System.out.println(i);



                if (i >= 3) {



                    int patient = resultSet.getInt(1);


                     PatientDAO patient1=new PatientDAO();
                     patient1.update(patient);
                    System.out.println("IP type patients need to admit");

                    Random random = new Random();
                    int identity = random.nextInt(9999);

                     int bed= random.nextInt(9999);



                    //InPatientBO inpatientBO = new InPatientBO();
                    //inpatientBO.;

                    patient1.insertIpPatient(patient,identity,bed);
                    BedDAO bedDAO=new BedDAO();
                    bedDAO.saveBed(bed);

                    System.out.println("Bed Allocation for Ip patients");
                    bedDAO.find();




                          }




                /**/


                }
            conn.close();

            }
     catch (Exception e) {
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
        }
    }
    /*public List<InPatient> update() {


        List<InPatient> p = new ArrayList<InPatient>();

        String myUrl = "jdbc:mysql://localhost:3306/HospitalMS?useSSL=false";
        String user = "root";
        String pass = "8883543506";

        try {

            InpatientDAO inpatientDAO=new InpatientDAO();
            inpatientDAO.iP();

            Connection conn = DriverManager.getConnection(myUrl, user, pass);
            Statement st = conn.createStatement();

            String query = st.executeUpdate("update from patient set type='IP' where id='" +  + "'");





            ResultSet resultSet = st.executeQuery(query);


            while (resultSet.next()) {

                Patient patient = new Patient();
                patient.setId(resultSet.getLong(1));
                patient.setPname(resultSet.getString(2));
                patient.setDob(resultSet.getString(3));
                patient.setPhoneno(resultSet.getString(4));
                patient.setType(resultSet.getString(5));
                p.add(patient);

            }


            st.close();
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        } finally {
            return p;
        }
    }*/
}
