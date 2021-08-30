package dao;

import buisnessobject.InPatientBO;
import entity.InPatient;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class InpatientDAO {

    String myUrl = "jdbc:mysql://localhost:3306/HospitalMS?useSSL=false";
    String user = "root";
    String pass = "8883543506";





    public void iP() {

        List<InPatientBO> i = new ArrayList<InPatientBO>();

        try {

            Connection conn = DriverManager.getConnection(myUrl, user, pass);

            Statement st = conn.createStatement();

            //Connection conn = DriverManager.getConnection(myUrl, user, pass);

            String query = "SELECT * FROM patient where type='op'";

            ResultSet resultSet = st.executeQuery(query);

            while (resultSet.next()) {

                Statement st1 = conn.createStatement();

                String query1 = "select * from visitor where patientid='" + resultSet.getLong(1) + "' ";

                ResultSet resultSet1 = st1.executeQuery(query1);

                resultSet1.getFetchSize();

                if (resultSet1.getFetchSize() >= 3) {

                    int a = 0;
                    int patient = resultSet.getInt(1);
                    PatientDAO patientDAO = new PatientDAO();
                    //Patient patient=new Patient();
                    //patientDAO.update(patient);
                    System.out.println("Updated successfully");

                }


            }


            conn.close();

        } catch (Exception e) {
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
        }
    }
}
