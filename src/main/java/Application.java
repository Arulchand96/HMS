import buisnessobject.*;
import dao.Appointment_statusDAO;
import dao.PatientDAO;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.*;
import java.util.Calendar;
import java.io.*;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Application
{
    public static void main(String args[]) {
        String months[] = {
                "Jan",
                "Feb",
                "Mar",
                "Apr",
                "May",
                "Jun",
                "Jul",
                "Aug",
                "Sep",
                "Oct",
                "Nov",
                "Dec"
        };
        Calendar calendar = Calendar.getInstance();
        //System.out.println("--------------------------------------------------------------------------------");
        int count1 = 4, count2 = 4, count3 = 4, count4 = 4, count5 = 4, count6 = 4;
        System.out.println("\n--------------------------------------------------------------------------------");
        System.out.println("            *** Welcome to Hospital Management System Project in Java ***");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.print("Date: " + months[calendar.get(Calendar.MONTH)] + " " + calendar.get(Calendar.DATE) + " " + calendar.get(Calendar.YEAR));
        System.out.println("\t\t\t\t\t\tTime: " + calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND));
        Hospital l = new Hospital();
        Appointment_status a = new Appointment_status();
        Doctor d = new Doctor();
        Patient p = new Patient();
        Medicine m = new Medicine();
        Scanner input = new Scanner(System.in);
        int choice, j, c1, status = 1, s1 = 1, s2 = 1, s3 = 1, s4 = 1, s5 = 1, s6=1;
        while (status == 1) {
            System.out.println("\n                                    MAIN MENU");
            System.out.println("-----------------------------------------------------------------------------------");
            System.out.println("1.Hospitals  2.Appointment   3.Doctors  4.Patients  5.Medicines   6.visitors  ");
            System.out.println("-----------------------------------------------------------------------------------");
            choice = input.nextInt();
            switch (choice) {
                case 1: {
                    s4 = 1;
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("                    **Hospitals**");
                    System.out.println("--------------------------------------------------------------------------------");
                    while (s4 == 1) {
                        System.out.println("1.Add New Entry \n2. Existing Hospitals List");
                        c1 = input.nextInt();
                        switch (c1) {
                            case 1: {
                                HospitalBO hospitalBO = new HospitalBO();
                                hospitalBO.createHospital();


                                break;
                            }
                            case 2: {

                                HospitalBO hospitalBO = new HospitalBO();
                                hospitalBO.viewHospital();

                                /*try {
                                    String myUrl = "jdbc:mysql://localhost:3306/HospitalMS";
                                    String user = "root";
                                    String pass = "8883543506";

                                    Connection conn = DriverManager.getConnection(myUrl, user, pass);

                                    String query = "SELECT * FROM hospital";

                                    Statement st = conn.createStatement();


                                    ResultSet rs = st.executeQuery(query);


                                    while (rs.next()) {
                                        int id = rs.getInt("id");
                                        String name = rs.getString("name");
                                        String location = rs.getString("location");


                                        // print the results
                                        System.out.format("%s, %s, %s\n", id, name, location);
                                    }
                                    st.close();
                                } catch (Exception e) {
                                    System.err.println("Got an exception! ");
                                    System.err.println(e.getMessage());
                                }*/


                                /*System.out.println("--------------------------------------------------------------------------------");
                                System.out.println("Id \t Hospital Name \t Location");
                                System.out.println("--------------------------------------------------------------------------------");*/

                            }
                            break;
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s4 = input.nextInt();
                    }

                }
                break;



                case 2:
                {
                    s6 = 1;
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("                       **APPOINTMENT STATUS**");
                    System.out.println("--------------------------------------------------------------------------------");
                    while (s6 == 1)
                    {
                        int  b = 1, c =2;
                        System.out.println("1.Add New Entry  2.Existing List  3.IP patient List");
                        c1 = input.nextInt();
                        switch (c1)
                        {
                            case 1:
                            {
                                Appointment_statusBO appointment_statusBO = new Appointment_statusBO();
                                appointment_statusBO.createAppointment_status();
                                break;
                            }


                                case 2:
                                    {
                                        Appointment_statusBO appointment_statusBO=new Appointment_statusBO();
                                        appointment_statusBO.viewAppointment_status();


                                       /* try {
                                            String myUrl = "jdbc:mysql://localhost:3306/HospitalMS";
                                            String user = "root";
                                            String pass = "8883543506";

                                            Connection conn = DriverManager.getConnection(myUrl, user, pass);

                                            String query = "SELECT * FROM appointment";

                                            Statement st = conn.createStatement();


                                            ResultSet rs = st.executeQuery(query);


                                            while (rs.next()) {

                                                int patient_id = rs.getInt("patient_id");
                                                String date_of_visit = rs.getString("date_of_visit");
                                                String purpose_of_visit = rs.getString("purpose_of_visit");
                                                int BP = rs.getInt("BP");
                                                int temperature = rs.getInt("temperature");
                                                String doctor_visit = rs.getString("doctor_visit");
                                                int is_firstvisit = rs.getInt("is_firstvisit");


                                                // print the results
                                                System.out.println("Patient id \t  Date of visit  \t  Purpose of visit  \t BP \t  Temperature  \t  Dotor visit  \t  Is firstvisit");
                                                System.out.format("%s, %s,%s, %s,%s, %s, %s\n", patient_id, date_of_visit, purpose_of_visit, BP, temperature, doctor_visit, is_firstvisit);
                                            }
                                            st.close();
                                        } catch (Exception e) {
                                            System.err.println("Got an exception! ");
                                            System.err.println(e.getMessage());
                                        }*/
                                        break;


                                    }
                            case 3:
                            {
                                try {
                                    String myUrl = "jdbc:mysql://localhost:3306/HospitalMS";
                                    String user = "root";
                                    String pass = "8883543506";

                                    Connection conn = DriverManager.getConnection(myUrl, user, pass);

                                    String query = "SELECT * FROM ip_patient";

                                    Statement st = conn.createStatement();


                                    ResultSet rs = st.executeQuery(query);


                                    while (rs.next()) {

                                        int patient_id = rs.getInt("patient_id");
                                        int ip_identification_number = rs.getInt("ip_identification_number");



                                        // print the results
                                        System.out.println("Patient id \t  ip identification number");
                                        System.out.format("%s, %s,%s, %s,%s, %s, %s\n", patient_id, ip_identification_number);
                                    }
                                    st.close();
                                } catch (Exception e) {
                                    System.err.println("Got an exception! ");
                                    System.err.println(e.getMessage());
                                }
                                break;
                            }


                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s6 = input.nextInt();
                    }
                    break;
                }
                case 3:
                {
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("                      **DOCTOR SECTION**");
                    System.out.println("--------------------------------------------------------------------------------");
                    s1 = 1;
                    while (s1 == 1)
                    {
                        System.out.println("1.Add New Entry\n2.Existing Doctors List");
                        c1 = input.nextInt();
                        switch (c1)
                        {
                            case 1:
                            {
                                DoctorBO doctorBO = new DoctorBO();
                                doctorBO.createDoctor();

                                break;
                            }
                            case 2:
                            {

                                DoctorBO doctorBO=new DoctorBO();
                                doctorBO.viewDoctor();
                                /*try {
                                    String myUrl = "jdbc:mysql://localhost:3306/HospitalMS";
                                    String user = "root";
                                    String pass = "8883543506";

                                    Connection conn = DriverManager.getConnection(myUrl, user, pass);

                                    String query = "SELECT * FROM doctor";

                                    Statement st = conn.createStatement();


                                    ResultSet rs = st.executeQuery(query);


                                    while (rs.next()) {


                                        int id = rs.getInt("id");
                                        String name = rs.getString("name");
                                        String specilist = rs.getString("specilist");
                                        String work_time = rs.getString("work_time");
                                        String qualification = rs.getString("qualification");
                                        String room_no = rs.getString("room_no");

                                        System.out.println("--------------------------------------------------------------------------------");
                                        System.out.println("id \t Name\t Specilist \t Timing \t Qualification \t Room No.");
                                        System.out.println("--------------------------------------------------------------------------------");
                                        System.out.format("%s\t, %s\t,%s\t, %s\t,%s\t, %s\n", id, name, specilist, work_time, qualification, room_no);



                                    }
                                    st.close();
                                } catch (Exception e) {
                                    System.err.println("Got an exception! ");
                                    System.err.println(e.getMessage());
                                }*/

                                break;
                            }
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s1 = input.nextInt();
                    }
                    break;
                }
                 case 4:
                {
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("                     **PATIENT SECTION**");
                    System.out.println("--------------------------------------------------------------------------------");
                    s2 = 1;
                    while (s2 == 1)
                    {
                        System.out.println("1.Add New Entry\n2.Existing Patients List");
                        c1 = input.nextInt();
                        switch (c1)
                        {
                            case 1:
                            {
                                PatientBO patientBO=new PatientBO();
                                patientBO.createPatient();

                                break;
                            }
                            case 2:
                            {

                                PatientBO patientBO=new PatientBO();
                                patientBO.viewPatient();
                                /* try {
                                    String myUrl = "jdbc:mysql://localhost:3306/HospitalMS";
                                    String user = "root";
                                    String pass = "8883543506";

                                    Connection conn = DriverManager.getConnection(myUrl, user, pass);

                                    String query = "SELECT * FROM patient";

                                    Statement st = conn.createStatement();


                                    ResultSet rs = st.executeQuery(query);


                                    while (rs.next()) {


                                        int id = rs.getInt("id");
                                        String name = rs.getString("name");
                                        String disease = rs.getString("disease");
                                        String sex = rs.getString("sex");
                                        String admit_status = rs.getString("admit_status");
                                        int age = rs.getInt("age");

                                        System.out.println("--------------------------------------------------------------------------------");
                                        System.out.println("id \t Name \t Disease \t Gender \t Admit Status \t Age");
                                        System.out.println("--------------------------------------------------------------------------------");
                                        System.out.format("%s\t, %s\t,%s\t, %s\t,%s\t, %s\n", id,name, disease, sex, admit_status,age);



                                    }
                                    st.close();
                                } catch (Exception e) {
                                    System.err.println("Got an exception! ");
                                    System.err.println(e.getMessage());
                                }*/


                                break;
                            }
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s2 = input.nextInt();
                    }
                    break;
                }
                case 5:
                {

                    s3 = 1;
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("                     **MEDICINE SECTION**");
                    System.out.println("--------------------------------------------------------------------------------");
                    while (s3 == 1)
                    {
                        System.out.println("1.Add New Entry\n2. Existing Medicines List");
                        c1 = input.nextInt();
                        switch (c1)
                        {
                            case 1:
                            {
                                MedicineBO medicineBO=new MedicineBO();
                                medicineBO.createMedicine();
                                break;
                            }
                            case 2:
                            {
                              MedicineBO medicineBO=new MedicineBO();
                              medicineBO.viewMedicine();
                                break;
                            }
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s3 = input.nextInt();
                    }
                    break;
                }

                case 6:
                {

                    s3 = 1;
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("                     **Visitors**");
                    System.out.println("--------------------------------------------------------------------------------");
                    while (s3 == 1)
                    {
                        System.out.println("1.Add New Visitors\n2. Existing visitors List");
                        c1 = input.nextInt();
                        switch (c1)
                        {
                            case 1:
                            {
                                VisitorBO visitorBO=new VisitorBO();
                                visitorBO.createVisitor();

                                break;
                            }
                            case 2:
                            {
                                VisitorBO visitorBO=new VisitorBO();
                                visitorBO.viewVisitor();

                                break;
                            }
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s3 = input.nextInt();
                    }
                    break;
                }



                default: {
                    System.out.println(" You Have Enter Wrong Choice!!!");
                }

            }
            System.out.println("\nReturn to MAIN MENU Press 1");
            status = input.nextInt();
        }

        }
    }


