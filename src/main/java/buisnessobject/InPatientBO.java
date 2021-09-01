package buisnessobject;




import dao.InpatientDAO;
import dao.PatientDAO;
import entity.InPatient;
import entity.Patient;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.*;

public class InPatientBO {

    public void createPatient() {
        Scanner input = new Scanner(System.in);
        System.out.print("name:-");
        String pname = input.nextLine();
        System.out.print("dob:-");
        String dob = input.nextLine();
        System.out.print("phoneno:-");
        String phoneno = input.nextLine();
        System.out.print("type:-");
        String type = input.nextLine();


        InPatient patient = new InPatient();
        patient.setPname(pname);
        patient.setDob(dob);
        patient.setPhoneno(phoneno);
        patient.setType(type);


        InpatientDAO patientDAO = new InpatientDAO();
        patientDAO.iP();
    }

    public void createIpPatient(long iden,int bed ) {
        Scanner input = new Scanner(System.in);
        System.out.print("InPatient Identification No:-");
        Long identityno = input.nextLong();
        System.out.print("Bed id:-");
        int bedid = input.nextInt();
        //System.out.print("phoneno:-");
        //String phoneno = input.nextLine();
        //System.out.print("type:-");
        //String type = input.nextLine();





        InpatientDAO patientDAO = new InpatientDAO();
        patientDAO.iP();

        InPatient patient = new InPatient();
        patient.setIdentityNo(iden);
        patient.setBedid(bed);
    }


    public void update() {


            /*  List<InPatient> p = new ArrayList<InPatient>();

            String myUrl = "jdbc:mysql://localhost:3306/HospitalMS?useSSL=false";
            String user = "root";
            String pass = "8883543506";

            try {

                Connection conn = DriverManager.getConnection(myUrl, user, pass);
                Statement st = conn.createStatement();

                String query = st.executeUpdate("update from patient set type='IP' where id='" + patient + "'");





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

        InpatientDAO inpatientDAO = new InpatientDAO();
        inpatientDAO.iP();

    }
}


